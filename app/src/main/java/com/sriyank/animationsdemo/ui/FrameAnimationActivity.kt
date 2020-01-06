package com.sriyank.animationsdemo.ui

import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.sriyank.animationsdemo.R
import kotlinx.android.synthetic.main.activity_frame_animation.*

class FrameAnimationActivity : AppCompatActivity() {

    lateinit var wifiSignalAnimation :AnimationDrawable
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_frame_animation)
    }

    override fun onStart() {
        super.onStart()

        target_image_drawable.setBackgroundResource(R.drawable.wifi_signal_animation_list)
        wifiSignalAnimation = target_image_drawable.background as AnimationDrawable
        wifiSignalAnimation.isOneShot = false
        wifiSignalAnimation.start()
    }

    fun startStopAnimation(view : View){

        if(wifiSignalAnimation.isRunning){
            wifiSignalAnimation.stop()
        }else{
            wifiSignalAnimation.start()
        }
    }
}
