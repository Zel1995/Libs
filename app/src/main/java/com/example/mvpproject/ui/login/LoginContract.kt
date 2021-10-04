package com.example.mvpproject.ui.login

import com.example.mvpproject.domain.User

abstract class LoginContract {
    enum class ViewState{
        IDLE,LOADING,SUCCESS,ERROR
    }
    enum class Error{
        LOGIN,PASSWORD
    }
    interface View {
        fun setState(state: ViewState)
        fun setAuthError(error:Error)
        fun openRegistration()
        fun openMainFragment()
    }

    interface Presenter {
        fun onAttach(view: View)
        fun onTryLogin(login:String,password:String)
        fun onRegistration()
        fun onForgotPassword()
        fun onDetach()
    }
}