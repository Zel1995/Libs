package com.example.mvpproject.ui.main

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.fragment.app.Fragment
import com.example.mvpproject.R

class MainFragment: Fragment(R.layout.fragment_main) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<ImageView>(R.id.image_view).animate().setDuration(1000).rotationBy(360f).rotationYBy(360f)
    }
}