package com.sriyank.animationsdemo.ui

import android.graphics.drawable.AnimatedVectorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.sriyank.animationsdemo.R
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

        val avdCloseToCheck = target_vector_drawable.drawable as AnimatedVectorDrawable
        avdCloseToCheck.start()
    }

    private fun checkToClose() {
        target_vector_drawable.setImageResource(R.drawable.avd_check_to_close)

        val avdCheckToClose = target_vector_drawable.drawable as AnimatedVectorDrawable
        avdCheckToClose.start()
    }
}
