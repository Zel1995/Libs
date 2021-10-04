package com.example.mvpproject.di.modules

import com.example.mvpproject.domain.LoginRepository
import com.example.mvpproject.domain.Storage.UserDao
import com.example.mvpproject.domain.mapping.UserMapperDbToUi
import com.example.mvpproject.domain.mapping.UserMapperUiToDb
import com.example.mvpproject.impl.LoginRepositoryImpl
import dagger.Module
import dagger.Provides

@Module
class RepositoryModule {

    @Provides
    fun provideLoginRepository(userDao: UserDao): LoginRepository = LoginRepositoryImpl(
        userDao,
        UserMapperDbToUi(),
        UserMapperUiToDb()
    )
}