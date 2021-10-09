package com.example.mvpproject.di

import com.example.mvpproject.di.modules.ApplicationModule
import com.example.mvpproject.di.modules.DataBaseModule
import com.example.mvpproject.di.modules.RepositoryModule
import com.example.mvpproject.di.modules.RouterModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [RepositoryModule::class, ApplicationModule::class, DataBaseModule::class, RouterModule::class])
interface AppComponent {

    fun getMainSubcomponent(): MainSubcomponent.Factory
}