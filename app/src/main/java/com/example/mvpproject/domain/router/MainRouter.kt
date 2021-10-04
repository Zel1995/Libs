package com.example.mvpproject.domain.router

import androidx.fragment.app.FragmentManager
import com.example.mvpproject.R
import com.example.mvpproject.ui.main.MainFragment
import com.example.mvpproject.ui.registration.RegistrationFragment
import javax.inject.Inject

class MainRouter @Inject constructor(val fragmentManager: FragmentManager) {
    fun openMainFragment() {
        fragmentManager.beginTransaction().addToBackStack("mainFragment")
            .replace(R.id.main_container, MainFragment()).commit()
    }

    fun openRegistrationFragment() {
        fragmentManager.beginTransaction().addToBackStack("registrationFragment")
            .replace(R.id.main_container, RegistrationFragment()).commit()
    }
}