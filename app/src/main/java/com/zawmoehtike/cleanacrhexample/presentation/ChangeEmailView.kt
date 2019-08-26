package com.zawmoehtike.cleanacrhexample.presentation

interface ChangeEmailView {
    fun getEmailInput(): String?
    fun showEmailValidationError()
    fun showChangedEmail(email: String)
    fun hideKeyboard()
}