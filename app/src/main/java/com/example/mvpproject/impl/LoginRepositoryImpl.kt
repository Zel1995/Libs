package com.example.mvpproject.impl

import com.example.mvpproject.domain.LoginRepository
import com.example.mvpproject.domain.Storage.UserDao
import com.example.mvpproject.domain.User
import com.example.mvpproject.domain.mapping.UserMapperDbToUi
import com.example.mvpproject.domain.mapping.UserMapperUiToDb

class LoginRepositoryImpl(
    private val userDao: UserDao,
    private val userMapperDbToUi: UserMapperDbToUi,
    private val userMapperUiToDb: UserMapperUiToDb
) : LoginRepository {

    override suspend fun getUsers(): List<User?> {
        return userMapperDbToUi.transformList(userDao.getAllUsers())
    }

    override suspend fun addUser(user: User):Long {
        return userDao.addNewUser(userMapperUiToDb.transform(user))
    }

    override suspend fun getByLogin(login: String): User? {
        val result = userDao.findByLogin(login)
        return userMapperDbToUi.transform(result)
    }


}