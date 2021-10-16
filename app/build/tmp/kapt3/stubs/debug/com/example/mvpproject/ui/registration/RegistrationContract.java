package com.example.mvpproject.ui.registration;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0005"}, d2 = {"Lcom/example/mvpproject/ui/registration/RegistrationContract;", "", "()V", "Presenter", "View", "app_debug"})
public final class RegistrationContract {
    
    public RegistrationContract() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\b\u0010\u0006\u001a\u00020\u0003H\'\u00a8\u0006\u0007"}, d2 = {"Lcom/example/mvpproject/ui/registration/RegistrationContract$View;", "Lmoxy/MvpView;", "completeRegistration", "", "userId", "", "setError", "app_debug"})
    public static abstract interface View extends moxy.MvpView {
        
        @moxy.viewstate.strategy.alias.Skip()
        public abstract void setError();
        
        @moxy.viewstate.strategy.alias.Skip()
        public abstract void completeRegistration(long userId);
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\b"}, d2 = {"Lcom/example/mvpproject/ui/registration/RegistrationContract$Presenter;", "Lmoxy/MvpPresenter;", "Lcom/example/mvpproject/ui/registration/RegistrationContract$View;", "()V", "onRegistration", "", "user", "Lcom/example/mvpproject/domain/User;", "app_debug"})
    public static abstract class Presenter extends moxy.MvpPresenter<com.example.mvpproject.ui.registration.RegistrationContract.View> {
        
        public Presenter() {
            super();
        }
        
        public abstract void onRegistration(@org.jetbrains.annotations.NotNull()
        com.example.mvpproject.domain.User user);
    }
}