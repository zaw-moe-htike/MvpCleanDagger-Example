package com.zawmoehtike.cleanacrhexample.dagger

import com.zawmoehtike.cleanacrhexample.presentation.MainActivity
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [CleanAcrhAppModule::class])
public interface CleanAcrhAppComponent {

    fun inject(mainActivity: MainActivity)
}