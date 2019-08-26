package com.zawmoehtike.cleanacrhexample.domain.mapper

import com.zawmoehtike.cleanacrhexample.data.entity.User
import com.zawmoehtike.cleanacrhexample.presentation.model.VMUser

object UserMapper {
    fun toVM(user: User): VMUser {
        return VMUser(user.email)
    }
}