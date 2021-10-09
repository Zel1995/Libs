package com.example.mvpproject.domain

data class User(
    val id: Long = 0,
    val login: String,
    val password: String,
    val name: String
)