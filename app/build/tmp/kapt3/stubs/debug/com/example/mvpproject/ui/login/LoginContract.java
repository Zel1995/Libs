package com.example.mvpproject.ui.login;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0007"}, d2 = {"Lcom/example/mvpproject/ui/login/LoginContract;", "", "()V", "Error", "Presenter", "View", "ViewBehavior", "app_debug"})
public abstract class LoginContract {
    
    public LoginContract() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/example/mvpproject/ui/login/LoginContract$ViewBehavior;", "", "(Ljava/lang/String;I)V", "IDLE", "LOADING", "SUCCESS", "ERROR", "app_debug"})
    public static enum ViewBehavior {
        /*public static final*/ IDLE /* = new IDLE() */,
        /*public static final*/ LOADING /* = new LOADING() */,
        /*public static final*/ SUCCESS /* = new SUCCESS() */,
        /*public static final*/ ERROR /* = new ERROR() */;
        
        ViewBehavior() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/example/mvpproject/ui/login/LoginContract$Error;", "", "(Ljava/lang/String;I)V", "LOGIN", "PASSWORD", "app_debug"})
    public static enum Error {
        /*public static final*/ LOGIN /* = new LOGIN() */,
        /*public static final*/ PASSWORD /* = new PASSWORD() */;
        
        Error() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\'\u00a8\u0006\t"}, d2 = {"Lcom/example/mvpproject/ui/login/LoginContract$View;", "Lmoxy/MvpView;", "setAuthError", "", "error", "Lcom/example/mvpproject/ui/login/LoginContract$Error;", "setState", "state", "Lcom/example/mvpproject/ui/login/LoginContract$ViewBehavior;", "app_debug"})
    public static abstract interface View extends moxy.MvpView {
        
        @moxy.viewstate.strategy.alias.Skip()
        public abstract void setState(@org.jetbrains.annotations.NotNull()
        com.example.mvpproject.ui.login.LoginContract.ViewBehavior state);
        
        @moxy.viewstate.strategy.alias.Skip()
        public abstract void setAuthError(@org.jetbrains.annotations.NotNull()
        com.example.mvpproject.ui.login.LoginContract.Error error);
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b&\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0005H&J\u0018\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH&\u00a8\u0006\u000b"}, d2 = {"Lcom/example/mvpproject/ui/login/LoginContract$Presenter;", "Lmoxy/MvpPresenter;", "Lcom/example/mvpproject/ui/login/LoginContract$View;", "()V", "onForgotPassword", "", "onRegistration", "onTryLogin", "login", "", "password", "app_debug"})
    public static abstract class Presenter extends moxy.MvpPresenter<com.example.mvpproject.ui.login.LoginContract.View> {
        
        public Presenter() {
            super();
        }
        
        public abstract void onTryLogin(@org.jetbrains.annotations.NotNull()
        java.lang.String login, @org.jetbrains.annotations.NotNull()
        java.lang.String password);
        
        public abstract void onRegistration();
        
        public abstract void onForgotPassword();
    }
}