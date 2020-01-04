package com.sriyank.animationsdemo

import android.animation.Animator
import android.animation.AnimatorInflater
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity(), Animator.AnimatorListener {

	private var mRotateAnimator : Animator? = null
	private var mScaleAnimator : Animator? = null
	private var mTranslateAnimator : Animator? = null
	private var mFadeAnimator : Animator? = null


	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)

	}


	fun rotateAnimation(view: View) {

		mRotateAnimator = AnimatorInflater.loadAnimator(this, R.animator.rotate)
		mRotateAnimator?.apply {
			setTarget(targetImage)
			addListener(this@MainActivity)
			start()

		}
	}

	fun scaleAnimation(view: View) {

		mScaleAnimator = AnimatorInflater.loadAnimator(this, R.animator.scale)
		mScaleAnimator?.apply {
			setTarget(targetImage)
			addListener(this@MainActivity)
			start()
		}
	}

	fun translateAnimation(view: View) {

		mTranslateAnimator= AnimatorInflater.loadAnimator(this, R.animator.translate)
		mTranslateAnimator?.apply {
			setTarget(targetImage)
			addListener(this@MainActivity)
			start()
		}
	}

	fun fadeAnimation(view: View) {

		mFadeAnimator= AnimatorInflater.loadAnimator(this, R.animator.alpha)
		mFadeAnimator?.apply {
			setTarget(targetImage)
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
