package com.example.mvpproject.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.mvpproject.R
import com.example.mvpproject.di.App
import com.example.mvpproject.di.MainSubcomponent
import com.example.mvpproject.di.modules.MainActivityModule
import com.example.mvpproject.domain.router.MainRouter
import com.example.mvpproject.ui.login.LoginFragment
import javax.inject.Inject

class MainActivity : AppCompatActivity(R.layout.activity_main) {
    @Inject
    lateinit var router: MainRouter
    lateinit var mainSubcomponent: MainSubcomponent
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainSubcomponent = (application as App).appComponent.getMainSubcomponent().create(
            MainActivityModule(this)
        )
        mainSubcomponent.injectMainActivity(this)
        if (savedInstanceState == null){
            supportFragmentManager.beginTransaction().replace(R.id.main_container, LoginFragment())
                .commit()
        }

    }


}