package com.example.mvpproject.di.modules

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentManager
import dagger.Module
import dagger.Provides

@Module
class MainActivityModule(val activity:AppCompatActivity) {
    @Provides
    fun provideFragmentManager():FragmentManager = activity.supportFragmentManager
}