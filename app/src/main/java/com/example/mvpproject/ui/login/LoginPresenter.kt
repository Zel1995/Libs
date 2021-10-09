package com.example.mvpproject.ui.login

import com.example.mvpproject.domain.LoginRepository
import com.example.mvpproject.domain.User
import kotlinx.coroutines.*

class LoginPresenter(private val loginRepository: LoginRepository) : LoginContract.Presenter {
    private var view: LoginContract.View? = null
    private val handler = CoroutineExceptionHandler { _, _ ->
        view?.setState(LoginContract.ViewState.ERROR)
    }

    override fun onAttach(view: LoginContract.View) {
        this.view = view
        view.setState(LoginContract.ViewState.IDLE)
    }

    override fun onTryLogin(login: String, password: String) {
        MainScope().launch {
            view?.setState(LoginContract.ViewState.LOADING)
            val user = withContext(Dispatchers.IO){
                delay(1000)
                loginRepository.getByLogin(login)
            }
            setViewStateByUserData(user,password)
        }
    }

    private fun setViewStateByUserData(user: User?, password: String) {
        if (user != null) {
            if (user.password == password) {
                view?.openMainFragment()
                view?.setState(LoginContract.ViewState.SUCCESS)
            } else {
                view?.setAuthError(LoginContract.Error.PASSWORD)
                view?.setState(LoginContract.ViewState.IDLE)
            }
        } else {
            view?.setAuthError(LoginContract.Error.LOGIN)
            view?.setState(LoginContract.ViewState.ERROR)
        }

    }

    override fun onRegistration() {
        view?.openRegistration()
    }

    override fun onForgotPassword() {
        //open restore password fragment
    }

    override fun onDetach() {
        this.view = null
    }
}
