package com.example.mvpproject.di.modules;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\u000b"}, d2 = {"Lcom/example/mvpproject/di/modules/PresenterModule;", "", "()V", "provideLoginPresenter", "Lcom/example/mvpproject/ui/login/LoginContract$Presenter;", "repository", "Lcom/example/mvpproject/domain/LoginRepository;", "router", "Lcom/github/terrakok/cicerone/Router;", "provideRegistrationPresenter", "Lcom/example/mvpproject/ui/registration/RegistrationContract$Presenter;", "app_debug"})
@dagger.Module()
public final class PresenterModule {
    
    public PresenterModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.example.mvpproject.ui.login.LoginContract.Presenter provideLoginPresenter(@org.jetbrains.annotations.NotNull()
    com.example.mvpproject.domain.LoginRepository repository, @org.jetbrains.annotations.NotNull()
    com.github.terrakok.cicerone.Router router) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.example.mvpproject.ui.registration.RegistrationContract.Presenter provideRegistrationPresenter(@org.jetbrains.annotations.NotNull()
    com.example.mvpproject.domain.LoginRepository repository) {
        return null;
    }
}