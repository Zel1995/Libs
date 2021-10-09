package com.example.mvpproject.ui.registration

import android.content.Context
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.mvpproject.R
import com.example.mvpproject.databinding.FragmentRegistrationBinding
import com.example.mvpproject.domain.User
import com.example.mvpproject.domain.router.MainRouter
import com.example.mvpproject.ui.MainActivity
import com.google.android.material.snackbar.Snackbar
import javax.inject.Inject

class RegistrationFragment : Fragment(R.layout.fragment_registration), RegistrationContract.View {
    @Inject
    lateinit var router: MainRouter

    @Inject
    lateinit var presenter: RegistrationContract.Presenter
    lateinit var viewBinding: FragmentRegistrationBinding
    override fun setError() {
        Toast.makeText(requireContext(), getString(R.string.error), Toast.LENGTH_SHORT).show()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewBinding = FragmentRegistrationBinding.bind(view)
        initViews()
        presenter.onAttach(this)
    }

    private fun initViews() {
        viewBinding.regBtn.setOnClickListener {
            presenter.onRegistration(initUser())
        }
    }

    private fun initUser(): User {
        with(viewBinding) {
            return User(
                0,
                regLogin.text.toString(),
                regPassword.text.toString(),
                regName.text.toString()
            )
        }
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        (context as? MainActivity)?.mainSubcomponent?.inject(this)

    }

    override fun completeRegistration(userId:Long) {
        clearInputs()
        if(userId == -1L){
            Snackbar.make(viewBinding.root,getString(R.string.login_is_exist),Snackbar.LENGTH_SHORT).show()
        }else{
            Snackbar.make(viewBinding.root,"Новый аккаунт зарегестрирован",Snackbar.LENGTH_SHORT).show()
        }
    }

    private fun clearInputs() {
        with(viewBinding){
            regLogin.setText("")
            regName.setText("")
            regPassword.setText("")
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        presenter.onDetach()
    }

}