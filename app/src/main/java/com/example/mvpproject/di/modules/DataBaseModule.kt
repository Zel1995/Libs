package com.example.mvpproject.di.modules

import android.app.Application
import androidx.room.Room
import com.example.mvpproject.domain.Storage.UserDao
import com.example.mvpproject.domain.Storage.UserDataBase
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class DataBaseModule {

    @Singleton
    @Provides
    fun provideUserDataBase(application: Application): UserDataBase =
        Room.databaseBuilder(application, UserDataBase::class.java, "UserDataBase")
            .fallbackToDestructiveMigration()
            .build()

    @Provides
    fun provideUserDao(dataBase: UserDataBase): UserDao = dataBase.getUserDao()
}