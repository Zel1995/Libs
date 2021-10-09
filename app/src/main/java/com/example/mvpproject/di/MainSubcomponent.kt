package com.example.mvpproject.di

import com.example.mvpproject.di.modules.MainActivityModule
import com.example.mvpproject.di.modules.PresenterModule
import com.example.mvpproject.di.modules.RouterModule
import com.example.mvpproject.ui.MainActivity
import com.example.mvpproject.ui.login.LoginFragment
import com.example.mvpproject.ui.registration.RegistrationFragment
import dagger.Subcomponent
import javax.inject.Singleton

@Subcomponent(modules = [PresenterModule::class,MainActivityModule::class])
interface MainSubcomponent {
    @Subcomponent.Factory
    interface Factory{
        fun create(mainActivityModule: MainActivityModule):MainSubcomponent
    }
    fun injectMainActivity(activity:MainActivity)
    fun injectLoginFragment(loginFragment: LoginFragment)
    fun inject(registrationFragment: RegistrationFragment)
}