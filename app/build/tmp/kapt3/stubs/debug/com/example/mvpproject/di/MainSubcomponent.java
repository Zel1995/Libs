package com.example.mvpproject.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\fJ\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH&\u00a8\u0006\r"}, d2 = {"Lcom/example/mvpproject/di/MainSubcomponent;", "", "inject", "", "registrationFragment", "Lcom/example/mvpproject/ui/registration/RegistrationFragment;", "injectLoginFragment", "loginFragment", "Lcom/example/mvpproject/ui/login/LoginFragment;", "injectMainActivity", "activity", "Lcom/example/mvpproject/ui/MainActivity;", "Factory", "app_debug"})
@dagger.Subcomponent(modules = {com.example.mvpproject.di.modules.PresenterModule.class, com.example.mvpproject.di.modules.MainActivityModule.class})
public abstract interface MainSubcomponent {
    
    public abstract void injectMainActivity(@org.jetbrains.annotations.NotNull()
    com.example.mvpproject.ui.MainActivity activity);
    
    public abstract void injectLoginFragment(@org.jetbrains.annotations.NotNull()
    com.example.mvpproject.ui.login.LoginFragment loginFragment);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.example.mvpproject.ui.registration.RegistrationFragment registrationFragment);
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/example/mvpproject/di/MainSubcomponent$Factory;", "", "create", "Lcom/example/mvpproject/di/MainSubcomponent;", "mainActivityModule", "Lcom/example/mvpproject/di/modules/MainActivityModule;", "app_debug"})
    @dagger.Subcomponent.Factory()
    public static abstract interface Factory {
        
        @org.jetbrains.annotations.NotNull()
        public abstract com.example.mvpproject.di.MainSubcomponent create(@org.jetbrains.annotations.NotNull()
        com.example.mvpproject.di.modules.MainActivityModule mainActivityModule);
    }
}