package com.zawmoehtike.cleanacrhexample.data

import com.zawmoehtike.cleanacrhexample.data.entity.User
import io.reactivex.Observable

interface UserRepositoryI {
    fun changeUserEmail(email: String): Observable<User>
}