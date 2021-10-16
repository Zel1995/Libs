package com.example.mvpproject.ui.login

import com.example.mvpproject.ui.main.MainFragment
import com.example.mvpproject.ui.registration.RegistrationFragment
import com.github.terrakok.cicerone.androidx.FragmentScreen

object Screens {
    fun main(login: String) = FragmentScreen { MainFragment.newInstance(login) }
    fun registration() = FragmentScreen { RegistrationFragment() }
    fun login() = FragmentScreen { LoginFragment() }
}