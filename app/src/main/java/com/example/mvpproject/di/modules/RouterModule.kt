package com.example.mvpproject.di.modules

import androidx.fragment.app.FragmentManager
import com.example.mvpproject.domain.router.MainRouter
import dagger.Module
import javax.inject.Inject

@Module
class RouterModule {
    @Inject
    fun providesRouter(fragmentManager: FragmentManager): MainRouter = MainRouter(fragmentManager)
}