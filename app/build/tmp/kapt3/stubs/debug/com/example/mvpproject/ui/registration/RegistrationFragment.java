package com.example.mvpproject.ui.registration;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0014\u001a\u00020\u0015H\u0002J\u0010\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u001aH\u0002J\b\u0010\u001b\u001a\u00020\u0015H\u0002J\u0010\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\u001a\u0010\u001f\u001a\u00020\u00152\u0006\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\b\u0010$\u001a\u00020\u0015H\u0016R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001e\u0010\n\u001a\u00020\u00058\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000fX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013\u00a8\u0006%"}, d2 = {"Lcom/example/mvpproject/ui/registration/RegistrationFragment;", "Lmoxy/MvpAppCompatFragment;", "Lcom/example/mvpproject/ui/registration/RegistrationContract$View;", "()V", "presenter", "Lcom/example/mvpproject/ui/registration/RegistrationContract$Presenter;", "getPresenter", "()Lcom/example/mvpproject/ui/registration/RegistrationContract$Presenter;", "presenter$delegate", "Lmoxy/ktx/MoxyKtxDelegate;", "presenterMoxy", "getPresenterMoxy", "setPresenterMoxy", "(Lcom/example/mvpproject/ui/registration/RegistrationContract$Presenter;)V", "viewBinding", "Lcom/example/mvpproject/databinding/FragmentRegistrationBinding;", "getViewBinding", "()Lcom/example/mvpproject/databinding/FragmentRegistrationBinding;", "setViewBinding", "(Lcom/example/mvpproject/databinding/FragmentRegistrationBinding;)V", "clearInputs", "", "completeRegistration", "userId", "", "initUser", "Lcom/example/mvpproject/domain/User;", "initViews", "onAttach", "context", "Landroid/content/Context;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "setError", "app_debug"})
public final class RegistrationFragment extends moxy.MvpAppCompatFragment implements com.example.mvpproject.ui.registration.RegistrationContract.View {
    @javax.inject.Inject()
    public com.example.mvpproject.ui.registration.RegistrationContract.Presenter presenterMoxy;
    private final moxy.ktx.MoxyKtxDelegate presenter$delegate = null;
    public com.example.mvpproject.databinding.FragmentRegistrationBinding viewBinding;
    
    public RegistrationFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.mvpproject.ui.registration.RegistrationContract.Presenter getPresenterMoxy() {
        return null;
    }
    
    public final void setPresenterMoxy(@org.jetbrains.annotations.NotNull()
    com.example.mvpproject.ui.registration.RegistrationContract.Presenter p0) {
    }
    
    private final com.example.mvpproject.ui.registration.RegistrationContract.Presenter getPresenter() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.mvpproject.databinding.FragmentRegistrationBinding getViewBinding() {
        return null;
    }
    
    public final void setViewBinding(@org.jetbrains.annotations.NotNull()
    com.example.mvpproject.databinding.FragmentRegistrationBinding p0) {
    }
    
    @java.lang.Override()
    public void setError() {
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initViews() {
    }
    
    private final com.example.mvpproject.domain.User initUser() {
        return null;
    }
    
    @java.lang.Override()
    public void onAttach(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    @java.lang.Override()
    public void completeRegistration(long userId) {
    }
    
    private final void clearInputs() {
    }
}