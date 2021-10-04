package com.example.mvpproject.domain

interface LoginRepository {

    suspend fun getUsers():List<User?>
    suspend fun addUser(user: User):Long
    suspend fun getByLogin(login:String):User?
}