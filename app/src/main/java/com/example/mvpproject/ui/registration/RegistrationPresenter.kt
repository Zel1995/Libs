package com.example.mvpproject.ui.registration

import com.example.mvpproject.domain.LoginRepository
import com.example.mvpproject.domain.User
import kotlinx.coroutines.*

class RegistrationPresenter(private val repository: LoginRepository) :
    RegistrationContract.Presenter {
    private var view: RegistrationContract.View? = null
    private val handler = CoroutineExceptionHandler { _, _ ->
        view?.setError()
    }

    override fun onAttach(view: RegistrationContract.View) {
        this.view = view
    }

    override fun onRegistration(user: User) {
        MainScope().launch(handler) {
            val result = withContext(Dispatchers.IO) {
                repository.addUser(user)
            }
            view?.completeRegistration(result)
        }
    }

    override fun onDetach() {
        view = null
    }
}