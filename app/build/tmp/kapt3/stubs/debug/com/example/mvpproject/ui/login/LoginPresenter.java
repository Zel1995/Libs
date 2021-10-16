package com.example.mvpproject.ui.login;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\t\u001a\u00020\nH\u0014J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\f\u001a\u00020\nH\u0016J\u0018\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u001a\u0010\u0011\u001a\u00020\n2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0010\u001a\u00020\u000fH\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/example/mvpproject/ui/login/LoginPresenter;", "Lcom/example/mvpproject/ui/login/LoginContract$Presenter;", "loginRepository", "Lcom/example/mvpproject/domain/LoginRepository;", "router", "Lcom/github/terrakok/cicerone/Router;", "(Lcom/example/mvpproject/domain/LoginRepository;Lcom/github/terrakok/cicerone/Router;)V", "handler", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "onFirstViewAttach", "", "onForgotPassword", "onRegistration", "onTryLogin", "login", "", "password", "setViewStateByUserData", "user", "Lcom/example/mvpproject/domain/User;", "app_debug"})
public final class LoginPresenter extends com.example.mvpproject.ui.login.LoginContract.Presenter {
    private final com.example.mvpproject.domain.LoginRepository loginRepository = null;
    private final com.github.terrakok.cicerone.Router router = null;
    private final kotlinx.coroutines.CoroutineExceptionHandler handler = null;
    
    public LoginPresenter(@org.jetbrains.annotations.NotNull()
    com.example.mvpproject.domain.LoginRepository loginRepository, @org.jetbrains.annotations.NotNull()
    com.github.terrakok.cicerone.Router router) {
        super();
    }
    
    @java.lang.Override()
    protected void onFirstViewAttach() {
    }
    
    @java.lang.Override()
    public void onTryLogin(@org.jetbrains.annotations.NotNull()
    java.lang.String login, @org.jetbrains.annotations.NotNull()
    java.lang.String password) {
    }
    
    private final void setViewStateByUserData(com.example.mvpproject.domain.User user, java.lang.String password) {
    }
    
    @java.lang.Override()
    public void onRegistration() {
    }
    
    @java.lang.Override()
    public void onForgotPassword() {
    }
}