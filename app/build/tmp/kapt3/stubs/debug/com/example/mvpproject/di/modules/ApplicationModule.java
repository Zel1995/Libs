package com.example.mvpproject.di.modules;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0003H\u0007J\b\u0010\u0006\u001a\u00020\u0007H\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/example/mvpproject/di/modules/ApplicationModule;", "", "app", "Landroid/app/Application;", "(Landroid/app/Application;)V", "providesApplication", "providesApplicationContext", "Landroid/content/Context;", "app_debug"})
@dagger.Module(subcomponents = {com.example.mvpproject.di.MainSubcomponent.class})
public final class ApplicationModule {
    private final android.app.Application app = null;
    
    public ApplicationModule(@org.jetbrains.annotations.NotNull()
    android.app.Application app) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final android.app.Application providesApplication() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final android.content.Context providesApplicationContext() {
        return null;
    }
}