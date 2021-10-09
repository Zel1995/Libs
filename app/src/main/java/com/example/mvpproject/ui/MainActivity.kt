package com.example.mvpproject.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.mvpproject.R
import com.example.mvpproject.di.App
import com.example.mvpproject.di.MainSubcomponent
import com.example.mvpproject.di.modules.MainActivityModule
import com.example.mvpproject.ui.login.Screens
import com.github.terrakok.cicerone.NavigatorHolder
import com.github.terrakok.cicerone.Router
import com.github.terrakok.cicerone.androidx.AppNavigator
import javax.inject.Inject

class MainActivity : AppCompatActivity(R.layout.activity_main) {
    @Inject
    lateinit var router:Router
    @Inject
    lateinit var navigatorHolder:NavigatorHolder
    lateinit var mainSubcomponent: MainSubcomponent
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainSubcomponent = (application as App).appComponent.getMainSubcomponent().create(
            MainActivityModule(this)
        )
        mainSubcomponent.injectMainActivity(this)
        if (savedInstanceState == null){
            router.navigateTo(Screens.login())
        }

    }
    private val navigator = AppNavigator(this, R.id.main_container)

    override fun onResumeFragments() {
        super.onResumeFragments()
        navigatorHolder.setNavigator(navigator)
    }

    override fun onPause() {
        navigatorHolder.removeNavigator()
        super.onPause()
    }

}