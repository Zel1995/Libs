package com.example.mvpproject.di

import com.example.mvpproject.di.modules.ApplicationModule
import com.example.mvpproject.di.modules.DataBaseModule
import com.example.mvpproject.di.modules.RepositoryModule
import com.example.mvpproject.domain.Storage.UserDao
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [RepositoryModule::class,ApplicationModule::class,DataBaseModule::class])
interface AppComponent {

    fun getMainSubcomponent():MainSubcomponent.Factory
}