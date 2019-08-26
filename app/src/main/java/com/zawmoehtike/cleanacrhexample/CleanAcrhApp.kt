package com.zawmoehtike.cleanacrhexample

import android.app.Application
import com.zawmoehtike.cleanacrhexample.dagger.CleanAcrhAppComponent
import com.zawmoehtike.cleanacrhexample.dagger.CleanAcrhAppModule
import com.zawmoehtike.cleanacrhexample.dagger.DaggerCleanAcrhAppComponent

class CleanAcrhApp: Application() {
    companion object{
        lateinit var appComponent: CleanAcrhAppComponent
    }

    override fun onCreate() {
        super.onCreate()
        appComponent =  DaggerCleanAcrhAppComponent.builder()
            .cleanAcrhAppModule(CleanAcrhAppModule(this))
            .build()
    }
}