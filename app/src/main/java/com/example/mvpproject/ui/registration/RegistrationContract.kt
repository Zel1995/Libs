package com.example.mvpproject.ui.registration

import com.example.mvpproject.domain.User

class RegistrationContract {
    interface View {
        fun setError()
        fun completeRegistration(userId:Long)
    }

    interface Presenter {
        fun onAttach(view: RegistrationContract.View)
        fun onRegistration(user: User)
        fun onDetach()
    }
}