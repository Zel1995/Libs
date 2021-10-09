package com.example.mvpproject.ui.login

import android.content.Context
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.mvpproject.R
import com.example.mvpproject.databinding.FragmentLoginBinding
import com.example.mvpproject.domain.router.MainRouter
import com.example.mvpproject.ui.MainActivity
import com.google.android.material.snackbar.Snackbar
import javax.inject.Inject

class LoginFragment : Fragment(R.layout.fragment_login), LoginContract.View {
    @Inject
    lateinit var presenter: LoginContract.Presenter
    @Inject
    lateinit var router:MainRouter
    private lateinit var viewBinding: FragmentLoginBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewBinding = FragmentLoginBinding.bind(view)
        initViews()
        presenter.onAttach(this)
    }

    private fun initViews() {
        with(viewBinding) {
            enterBtn.setOnClickListener {
                presenter.onTryLogin(
                    loginEdit.text.toString(),
                    passwordEdit.text.toString()
                )
            }
            registrationBtn.setOnClickListener {
                presenter.onRegistration()
            }
            forgotPasswordBtn.setOnClickListener {
                presenter.onForgotPassword()
            }
        }
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        (context as? MainActivity)?.mainSubcomponent?.injectLoginFragment(this)
    }

    override fun setState(state: LoginContract.ViewState) {
        hideViews()
        when (state) {
            LoginContract.ViewState.IDLE -> {
                viewBinding.contentLayout.visibility = View.VISIBLE
            }
            LoginContract.ViewState.SUCCESS -> {
                viewBinding.contentLayout.visibility = View.VISIBLE
                Toast.makeText(context, getString(R.string.success), Toast.LENGTH_SHORT).show()
            }
            LoginContract.ViewState.ERROR -> {
                viewBinding.contentLayout.visibility = View.VISIBLE
                Snackbar.make(viewBinding.root, getString(R.string.error), Snackbar.LENGTH_SHORT)
                    .show()
            }
            LoginContract.ViewState.LOADING -> {
                viewBinding.contentLayout.visibility = View.INVISIBLE
                viewBinding.progress.visibility = View.VISIBLE
            }
        }
    }


    private fun hideViews() {
        viewBinding.contentLayout.visibility = View.INVISIBLE
        viewBinding.progress.visibility = View.GONE
    }

    override fun setAuthError(error: LoginContract.Error) {
        when (error) {
            LoginContract.Error.LOGIN -> viewBinding.loginEdit.setError(getErrorMsgByCode(error))
            LoginContract.Error.PASSWORD -> viewBinding.passwordEdit.setError(getErrorMsgByCode(error)
            )
        }

    }

    override fun openRegistration() {
        router.openRegistrationFragment()
    }

    override fun openMainFragment() {
        router.openMainFragment()
    }

    override fun onDestroy() {
        super.onDestroy()
        presenter.onDetach()
    }

    private fun getErrorMsgByCode(error: LoginContract.Error): String {
        return when (error) {
            LoginContract.Error.LOGIN -> getString(R.string.login_error)
            LoginContract.Error.PASSWORD -> getString(R.string.password_error)
        }
    }

}