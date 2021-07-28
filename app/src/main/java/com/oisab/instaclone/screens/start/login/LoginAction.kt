package com.oisab.instaclone.screens.start.login

sealed class LoginAction {
    data class ShowMessage(val message: String?) : LoginAction()
    object NavigateToMenu: LoginAction()
    object NavigateToRegistration: LoginAction()
    object NavigateToForgotPassword: LoginAction()
}