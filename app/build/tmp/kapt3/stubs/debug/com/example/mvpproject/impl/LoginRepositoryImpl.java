package com.example.mvpproject.impl;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0019\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ\u001b\u0010\u000e\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000f\u001a\u00020\u0010H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J\u0019\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0013H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0015"}, d2 = {"Lcom/example/mvpproject/impl/LoginRepositoryImpl;", "Lcom/example/mvpproject/domain/LoginRepository;", "userDao", "Lcom/example/mvpproject/domain/Storage/UserDao;", "userMapperDbToUi", "Lcom/example/mvpproject/domain/mapping/UserMapperDbToUi;", "userMapperUiToDb", "Lcom/example/mvpproject/domain/mapping/UserMapperUiToDb;", "(Lcom/example/mvpproject/domain/Storage/UserDao;Lcom/example/mvpproject/domain/mapping/UserMapperDbToUi;Lcom/example/mvpproject/domain/mapping/UserMapperUiToDb;)V", "addUser", "", "user", "Lcom/example/mvpproject/domain/User;", "(Lcom/example/mvpproject/domain/User;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getByLogin", "login", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getUsers", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class LoginRepositoryImpl implements com.example.mvpproject.domain.LoginRepository {
    private final com.example.mvpproject.domain.Storage.UserDao userDao = null;
    private final com.example.mvpproject.domain.mapping.UserMapperDbToUi userMapperDbToUi = null;
    private final com.example.mvpproject.domain.mapping.UserMapperUiToDb userMapperUiToDb = null;
    
    public LoginRepositoryImpl(@org.jetbrains.annotations.NotNull()
    com.example.mvpproject.domain.Storage.UserDao userDao, @org.jetbrains.annotations.NotNull()
    com.example.mvpproject.domain.mapping.UserMapperDbToUi userMapperDbToUi, @org.jetbrains.annotations.NotNull()
    com.example.mvpproject.domain.mapping.UserMapperUiToDb userMapperUiToDb) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getUsers(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.example.mvpproject.domain.User>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object addUser(@org.jetbrains.annotations.NotNull()
    com.example.mvpproject.domain.User user, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Long> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getByLogin(@org.jetbrains.annotations.NotNull()
    java.lang.String login, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.mvpproject.domain.User> continuation) {
        return null;
    }
}