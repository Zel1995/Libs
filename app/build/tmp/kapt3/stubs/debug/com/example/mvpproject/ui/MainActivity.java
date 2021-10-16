package com.example.mvpproject.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0014J\b\u0010\u001b\u001a\u00020\u0018H\u0014J\b\u0010\u001c\u001a\u00020\u0018H\u0014R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0011\u001a\u00020\u00128\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016\u00a8\u0006\u001d"}, d2 = {"Lcom/example/mvpproject/ui/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "mainSubcomponent", "Lcom/example/mvpproject/di/MainSubcomponent;", "getMainSubcomponent", "()Lcom/example/mvpproject/di/MainSubcomponent;", "setMainSubcomponent", "(Lcom/example/mvpproject/di/MainSubcomponent;)V", "navigator", "Lcom/github/terrakok/cicerone/androidx/AppNavigator;", "navigatorHolder", "Lcom/github/terrakok/cicerone/NavigatorHolder;", "getNavigatorHolder", "()Lcom/github/terrakok/cicerone/NavigatorHolder;", "setNavigatorHolder", "(Lcom/github/terrakok/cicerone/NavigatorHolder;)V", "router", "Lcom/github/terrakok/cicerone/Router;", "getRouter", "()Lcom/github/terrakok/cicerone/Router;", "setRouter", "(Lcom/github/terrakok/cicerone/Router;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onPause", "onResumeFragments", "app_debug"})
public final class MainActivity extends androidx.appcompat.app.AppCompatActivity {
    @javax.inject.Inject()
    public com.github.terrakok.cicerone.Router router;
    @javax.inject.Inject()
    public com.github.terrakok.cicerone.NavigatorHolder navigatorHolder;
    public com.example.mvpproject.di.MainSubcomponent mainSubcomponent;
    private final com.github.terrakok.cicerone.androidx.AppNavigator navigator = null;
    
    public MainActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.github.terrakok.cicerone.Router getRouter() {
        return null;
    }
    
    public final void setRouter(@org.jetbrains.annotations.NotNull()
    com.github.terrakok.cicerone.Router p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.github.terrakok.cicerone.NavigatorHolder getNavigatorHolder() {
        return null;
    }
    
    public final void setNavigatorHolder(@org.jetbrains.annotations.NotNull()
    com.github.terrakok.cicerone.NavigatorHolder p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.mvpproject.di.MainSubcomponent getMainSubcomponent() {
        return null;
    }
    
    public final void setMainSubcomponent(@org.jetbrains.annotations.NotNull()
    com.example.mvpproject.di.MainSubcomponent p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected void onResumeFragments() {
    }
    
    @java.lang.Override()
    protected void onPause() {
    }
}