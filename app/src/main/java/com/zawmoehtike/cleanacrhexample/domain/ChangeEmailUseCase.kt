package com.zawmoehtike.cleanacrhexample.domain

import com.zawmoehtike.cleanacrhexample.data.UserRepositoryI
import com.zawmoehtike.cleanacrhexample.domain.mapper.UserMapper
import com.zawmoehtike.cleanacrhexample.presentation.model.VMUser
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class ChangeEmailUseCase @Inject constructor(private val userRepository: UserRepositoryI) {

    fun changeUserEmail(email: String): Observable<VMUser> {
        return userRepository.changeUserEmail(email)
            .map {
                UserMapper.toVM(it)
            }
            .observeOn(AndroidSchedulers.mainThread())
    }
}