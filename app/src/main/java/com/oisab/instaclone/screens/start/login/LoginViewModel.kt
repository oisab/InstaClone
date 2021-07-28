package com.oisab.instaclone.screens.start.login

import com.oisab.instaclone.screens.BaseViewModel

class LoginViewModel : BaseViewModel<LoginViewState, LoginAction, LoginEvent>() {

    override fun obtainEvent(viewEvent: LoginEvent) {
        when (viewEvent) {
            LoginEvent.ForgotPasswordClick -> viewAction = LoginAction.NavigateToForgotPassword
            LoginEvent.RegistrationClick -> viewAction = LoginAction.NavigateToRegistration
            is LoginEvent.LogInClick -> performLogin(viewEvent.login, viewEvent.password)
        }
    }

    private fun performLogin(login: String, password: String) {
        if (validateLogin(login) && validatePassword(password)) {
            viewState = LoginViewState.LoginButtonEnabled
            viewAction = LoginAction.NavigateToMenu
        } else {
            viewState = LoginViewState.LoginButtonEnabled
            viewAction = LoginAction.ShowMessage("Invalid login or password")
        }
    }

    private fun validateLogin(login: String): Boolean = login.matches(
        Regex(

            "^[\\w! #\$%&‘*+-/=?^`~.]{1,64}@[\\w! #\$%&‘*+-/=?^`~.]" +
                    "{1,253}\\.[a-z]{2,6}$"
        )
    )

    private fun validatePassword(password: String): Boolean = password.matches(
        Regex(
            "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])" +
                    "(?=.*[!@#&()–[{}]:;',?/*~\$^+=<>]).{8,32}$"
        )
    )
}