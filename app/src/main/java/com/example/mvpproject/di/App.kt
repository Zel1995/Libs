package com.example.mvpproject.di

import android.app.Application
import com.example.mvpproject.di.modules.ApplicationModule

class App : Application() {
    val appComponent = DaggerAppComponent.builder()
        .applicationModule(ApplicationModule(this))
        .build()

}