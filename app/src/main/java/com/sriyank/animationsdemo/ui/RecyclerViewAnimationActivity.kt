package com.sriyank.animationsdemo.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.LinearLayoutManager
import com.sriyank.animationsdemo.Landscape
import com.sriyank.animationsdemo.R
import com.sriyank.animationsdemo.adapters.AnimationRecyclerAdapter
import jp.wasabeef.recyclerview.adapters.AlphaInAnimationAdapter
import jp.wasabeef.recyclerview.adapters.ScaleInAnimationAdapter
import jp.wasabeef.recyclerview.animators.OvershootInRightAnimator
import jp.wasabeef.recyclerview.animators.ScaleInBottomAnimator
import kotlinx.android.synthetic.main.activity_recycler_view_animation.*

class RecyclerViewAnimationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view_animation)

        setUpRecyclerView()
    }

    private fun setUpRecyclerView() {

        val adapter = AnimationRecyclerAdapter(this, Landscape.data)
        recyclerView.adapter = AlphaInAnimationAdapter(adapter)

        val layoutManager = LinearLayoutManager(this)
        layoutManager.orientation = LinearLayoutManager.VERTICAL
        recyclerView.layoutManager = layoutManager

        recyclerView.itemAnimator = OvershootInRightAnimator()
        recyclerView.itemAnimator?.apply{
            addDuration = 200
            removeDuration = 200

        }
    }
}
