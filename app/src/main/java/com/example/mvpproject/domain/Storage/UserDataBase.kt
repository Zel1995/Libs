package com.example.mvpproject.domain.Storage

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [UserEntity::class],version = 3)
abstract class UserDataBase:RoomDatabase() {
    abstract fun  getUserDao():UserDao
}