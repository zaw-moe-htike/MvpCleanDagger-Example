package com.zawmoehtike.cleanacrhexample.util

import android.text.TextUtils

object EmailValidationUtils {

    fun isValidEmail(email: String?): Boolean {
        return email?.let {
            !TextUtils.isEmpty(email) && android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()
        } ?: false
    }
}