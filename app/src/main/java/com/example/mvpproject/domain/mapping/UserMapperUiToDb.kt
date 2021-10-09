package com.example.mvpproject.domain.mapping

import com.example.mvpproject.domain.Storage.UserEntity
import com.example.mvpproject.domain.User

class UserMapperUiToDb {
    fun transform(user: User): UserEntity {
        return with(user) {
            UserEntity(id, login, password, name)
        }
    }
}