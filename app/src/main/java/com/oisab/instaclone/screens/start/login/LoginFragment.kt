package com.oisab.instaclone.screens.start.login

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText
import androidx.appcompat.widget.AppCompatTextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.oisab.instaclone.R

class LoginFragment : Fragment(R.layout.fragment_login) {
    private lateinit var loginViewModel: LoginViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        loginViewModel = ViewModelProvider(this).get(LoginViewModel::class.java)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val loginButton: Button = view.findViewById(R.id.loginButton)
        val forgotPasswordTextView: AppCompatTextView = view.findViewById(R.id.forgotPasswordTextField)
        val registrationTextView: AppCompatTextView = view.findViewById(R.id.registrationTextField)
        val loginEditText: AppCompatEditText = view.findViewById(R.id.loginTextField)
        val passwordEditText: AppCompatEditText = view.findViewById(R.id.passwordTextField)

        loginViewModel.viewStates().observe(viewLifecycleOwner, { bindViewState(it) })
        loginViewModel.viewActions().observe(viewLifecycleOwner, { bindViewAction(it) })

        forgotPasswordTextView.setOnClickListener {
            loginViewModel.obtainEvent(LoginEvent.ForgotPasswordClick)
        }
        registrationTextView.setOnClickListener {
            loginViewModel.obtainEvent(LoginEvent.RegistrationClick)
        }
        loginButton.setOnClickListener {
//            loginViewModel.obtainEvent(LoginEvent.LogInClick(loginEditText.text.toString(), passwordEditText.text.toString()))
            loginViewModel.obtainEvent(LoginEvent.LogInClick("oisab19@gmail.com", "rv(&*y87y(*YH"))

        }
    }

    private fun bindViewState(viewState: LoginViewState) {
        when (viewState) {
            LoginViewState.LoginButtonEnabled -> {
                val loginButton: AppCompatButton = requireView().findViewById(R.id.loginButton)
                loginButton.isEnabled = false
                loginButton.postDelayed({
                    loginButton.isEnabled = true
                }, 2000)
            }
        }
    }

    private fun bindViewAction(loginAction: LoginAction) {
        when(loginAction) {
            is LoginAction.ShowMessage -> Toast.makeText(requireContext(), loginAction.message, Toast.LENGTH_SHORT).show()
            LoginAction.NavigateToMenu -> findNavController().navigate(R.id.action_loginFragment_to_menu_navigation_graph)
            LoginAction.NavigateToRegistration -> findNavController().navigate(R.id.action_loginFragment_to_registrationFragment)
            LoginAction.NavigateToForgotPassword -> findNavController().navigate(R.id.action_loginFragment_to_forgotPasswordFragment)
        }
    }

}