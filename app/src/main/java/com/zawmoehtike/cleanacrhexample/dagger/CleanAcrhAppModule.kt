package com.zawmoehtike.cleanacrhexample.dagger

import android.content.Context
import com.zawmoehtike.cleanacrhexample.data.UserRepositoryI
import com.zawmoehtike.cleanacrhexample.data.repository.UserRepository
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class CleanAcrhAppModule(val context: Context) {

    @Provides
    @Singleton
    fun provideUserRepository(): UserRepositoryI {
        return UserRepository()
    }
}