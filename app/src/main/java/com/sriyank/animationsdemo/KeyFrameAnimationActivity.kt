package com.sriyank.animationsdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.transition.ChangeBounds
import android.transition.TransitionManager
import android.view.animation.AnticipateOvershootInterpolator
import androidx.constraintlayout.widget.ConstraintSet
import kotlinx.android.synthetic.main.activity_key_frame_animation.*


class KeyFrameAnimationActivity : AppCompatActivity() {

    private var isDetailLayout = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_key_frame_animation)

        constraintLayoutFrameAnimation.setOnClickListener {
            if (isDetailLayout)
            // switch to default layout
                swapFrames(R.layout.activity_key_frame_animation)
            else
            // switch to detail layout
                swapFrames(R.layout.activity_key_frame_animation_detail)
        }
    }

    private fun swapFrames(layoutId: Int) {
        val constraintSet = ConstraintSet()
        constraintSet.clone(this, layoutId)

        val transition = ChangeBounds()
        transition.interpolator = AnticipateOvershootInterpolator(1.0f)
        transition.duration = 1200

        TransitionManager.beginDelayedTransition(constraintLayoutFrameAnimation, transition)
        constraintSet.applyTo(constraintLayoutFrameAnimation)

        isDetailLayout = !isDetailLayout

    }
}
