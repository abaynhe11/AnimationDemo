package com.sriyank.animationsdemo

import android.animation.Animator
import android.animation.AnimatorInflater
import android.animation.ObjectAnimator
import android.animation.ValueAnimator
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity(), Animator.AnimatorListener {

	private var mRotateAnimator : ObjectAnimator? = null
	private var mScaleAnimator : ObjectAnimator? = null
	private var mTranslateAnimator : ObjectAnimator? = null
	private var mFadeAnimator : ObjectAnimator? = null


	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)

	}


	fun rotateAnimation(view: View) {

		mRotateAnimator = ObjectAnimator.ofFloat(targetImage,"rotation",0f,180f)
		mRotateAnimator?.apply {
			duration = 1500
            repeatCount = 1
            repeatMode = ValueAnimator.REVERSE
			addListener(this@MainActivity)
			start()

		}
	}

	fun scaleAnimation(view: View) {

		mScaleAnimator = ObjectAnimator.ofFloat(targetImage,"scaleX", 1f, 3f)
		mScaleAnimator?.apply {
			duration = 1000
            repeatCount = 1
            repeatMode = ValueAnimator.REVERSE
			addListener(this@MainActivity)
			start()
		}
	}

	fun translateAnimation(view: View) {

		mTranslateAnimator= ObjectAnimator.ofFloat(targetImage, "translationX", 0f, 200f )
		mTranslateAnimator?.apply {
			duration = 1000
            repeatCount = 1
            repeatMode = ValueAnimator.REVERSE
			addListener(this@MainActivity)
			start()
		}
	}

	fun fadeAnimation(view: View) {

		mFadeAnimator= ObjectAnimator.ofFloat(targetImage, "alpha", 1f, 0f)
		mFadeAnimator?.apply {
			duration = 1500
            repeatMode = ValueAnimator.REVERSE
            repeatCount = 1
			addListener(this@MainActivity)
			start()

		}
	}

	override fun onAnimationRepeat(animation: Animator?) {

		when(animation){
			mRotateAnimator->
				Toast.makeText(this, "Rotate Animation Repeat", Toast.LENGTH_SHORT).show()

			mScaleAnimator->
				Toast.makeText(this, "Scale Animation Repeat", Toast.LENGTH_SHORT).show()

			mTranslateAnimator->
				Toast.makeText(this, "Translate Animation Repeat", Toast.LENGTH_SHORT).show()

			mFadeAnimator->
				Toast.makeText(this, "Fade Animation Repeat", Toast.LENGTH_SHORT).show()
		}

	}

	override fun onAnimationEnd(animation: Animator?) {
		when(animation){
			mRotateAnimator->
				Toast.makeText(this, "Rotate Animation End", Toast.LENGTH_SHORT).show()

			mScaleAnimator->
				Toast.makeText(this, "Scale Animation End", Toast.LENGTH_SHORT).show()

			mTranslateAnimator->
				Toast.makeText(this, "Translate Animation End", Toast.LENGTH_SHORT).show()

			mFadeAnimator->
				Toast.makeText(this, "Fade Animation End", Toast.LENGTH_SHORT).show()
		}
	}

	override fun onAnimationCancel(animation: Animator?) {
		Toast.makeText(this, "Animation Cancel", Toast.LENGTH_SHORT).show()
	}

	override fun onAnimationStart(animation: Animator?) {
		when(animation){
			mRotateAnimator->
				Toast.makeText(this, "Rotate Animation Start", Toast.LENGTH_SHORT).show()

			mScaleAnimator->
				Toast.makeText(this, "Scale Animation Start", Toast.LENGTH_SHORT).show()

			mTranslateAnimator->
				Toast.makeText(this, "Translate Animation Start", Toast.LENGTH_SHORT).show()

			mFadeAnimator->
				Toast.makeText(this, "Fade Animation Start", Toast.LENGTH_SHORT).show()
		}
	}


}
