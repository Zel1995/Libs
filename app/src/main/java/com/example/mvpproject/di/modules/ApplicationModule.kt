package com.example.mvpproject.di.modules

import android.app.Application
import android.content.Context
import com.example.mvpproject.di.MainSubcomponent
import dagger.Module
import dagger.Provides

@Module(subcomponents = [MainSubcomponent::class])
class ApplicationModule(private val app: Application) {
    @Provides
    fun providesApplication(): Application = app

    @Provides
    fun providesApplicationContext(): Context = app
}