package com.zawmoehtike.cleanacrhexample.data.repository

import com.zawmoehtike.cleanacrhexample.data.UserRepositoryI
import com.zawmoehtike.cleanacrhexample.data.entity.User
import io.reactivex.Observable
import io.reactivex.schedulers.Schedulers
import java.util.*

class UserRepository: UserRepositoryI {

    override fun changeUserEmail(email: String): Observable<User> {
        return Observable.create<User> { sb ->
            //Transaction or network imitation
            Thread.sleep(2000)

            sb.onNext(User(email, UUID.randomUUID().toString()))
        }.subscribeOn(Schedulers.io())
    }
}