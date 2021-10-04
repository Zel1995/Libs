package com.example.mvpproject.di.modules

import com.example.mvpproject.domain.LoginRepository
import com.example.mvpproject.ui.login.LoginContract
import com.example.mvpproject.ui.login.LoginPresenter
import com.example.mvpproject.ui.registration.RegistrationContract
import com.example.mvpproject.ui.registration.RegistrationPresenter
import dagger.Module
import dagger.Provides

@Module
class PresenterModule {
    @Provides
    fun provideLoginPresenter(repository: LoginRepository): LoginContract.Presenter = LoginPresenter(repository)
    @Provides
    fun provideRegistrationPresenter(repository: LoginRepository):RegistrationContract.Presenter = RegistrationPresenter(repository)
}