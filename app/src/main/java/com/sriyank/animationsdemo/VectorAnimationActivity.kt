package com.sriyank.animationsdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat
import kotlinx.android.synthetic.main.activity_vector_animation.*

class VectorAnimationActivity : AppCompatActivity() {

    private var isChecked = true
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vector_animation)

        target_vector_drawable.setOnClickListener{

            if(isChecked){
                checkToClose()
            }else{
                closeToCheck()
            }

            isChecked = !isChecked
        }
    }

    private fun closeToCheck() {
        target_vector_drawable.setImageResource(R.drawable.avd_close_to_check)

        val avdCloseToCheck = target_vector_drawable.drawable as AnimatedVectorDrawableCompat
        avdCloseToCheck.start()
    }

    private fun checkToClose() {
        target_vector_drawable.setImageResource(R.drawable.avd_check_to_close)

        val avdCheckToClose = target_vector_drawable.drawable as AnimatedVectorDrawableCompat
        avdCheckToClose.start()
    }
}
