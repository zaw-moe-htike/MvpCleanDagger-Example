package com.zawmoehtike.cleanacrhexample.presentation

import com.zawmoehtike.cleanacrhexample.domain.ChangeEmailUseCase
import com.zawmoehtike.cleanacrhexample.util.EmailValidationUtils
import javax.inject.Inject

class ChangeEmailPresenter @Inject constructor(private val changeEmailUseCase: ChangeEmailUseCase) {

    var view: ChangeEmailView? = null

    fun onConfirmButtonPressed() {
        view?.let { view ->
            val emailInput = view.getEmailInput()
            emailInput?.let {
                if (EmailValidationUtils.isValidEmail(emailInput)) {
                    view.hideKeyboard()
                    changeEmailUseCase.changeUserEmail(emailInput)
                        .subscribe({ user ->
                            view.showChangedEmail(user.email)
                        }, {
                            //Error while changing email
                        })
                } else {
                    view.showEmailValidationError()
                }
            } ?: view.showEmailValidationError()
        }
    }

    fun onViewCreated(view: ChangeEmailView) {
        this.view = view
    }

    fun onViewDestroyed() {
        view = null
    }
}