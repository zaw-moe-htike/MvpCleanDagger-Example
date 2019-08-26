package com.zawmoehtike.cleanacrhexample.presentation

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.inputmethod.InputMethodManager
import com.zawmoehtike.cleanacrhexample.CleanAcrhApp
import com.zawmoehtike.cleanacrhexample.R
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : AppCompatActivity(), ChangeEmailView {

    @Inject
    lateinit var presenter: ChangeEmailPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        CleanAcrhApp.appComponent.inject(this)

        confirmButton.setOnClickListener {
            presenter.onConfirmButtonPressed()
        }

        presenter.onViewCreated(this)
    }

    override fun onDestroy() {
        presenter.onViewDestroyed()
        super.onDestroy()
    }

    override fun getEmailInput() = emailEditText.text.toString()

    override fun showEmailValidationError() {
        emailEditText.error = getString(R.string.email_validation_error)
    }

    override fun showChangedEmail(email: String) {
        changedEmailTextView.text = email
    }

    override fun hideKeyboard() {
        val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        currentFocus?.windowToken.let {
            imm.hideSoftInputFromWindow(it, 0)
        }
    }
}

