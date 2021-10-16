package com.example.mvpproject.di.modules;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007J\u0016\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007J\u0016\u0010\t\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007\u00a8\u0006\n"}, d2 = {"Lcom/example/mvpproject/di/modules/RouterModule;", "", "()V", "provideCicerone", "Lcom/github/terrakok/cicerone/Cicerone;", "Lcom/github/terrakok/cicerone/Router;", "provideNavigator", "Lcom/github/terrakok/cicerone/NavigatorHolder;", "cicerone", "provideRouter", "app_debug"})
@dagger.Module()
public final class RouterModule {
    
    public RouterModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.github.terrakok.cicerone.Cicerone<com.github.terrakok.cicerone.Router> provideCicerone() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.github.terrakok.cicerone.Router provideRouter(@org.jetbrains.annotations.NotNull()
    com.github.terrakok.cicerone.Cicerone<com.github.terrakok.cicerone.Router> cicerone) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.github.terrakok.cicerone.NavigatorHolder provideNavigator(@org.jetbrains.annotations.NotNull()
    com.github.terrakok.cicerone.Cicerone<com.github.terrakok.cicerone.Router> cicerone) {
        return null;
    }
}