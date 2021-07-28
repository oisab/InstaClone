package com.oisab.instaclone.screens.start.login

sealed class LoginEvent {
    data class LogInClick(val login: String, val password: String): LoginEvent()
    object RegistrationClick: LoginEvent()
    object ForgotPasswordClick: LoginEvent()
}