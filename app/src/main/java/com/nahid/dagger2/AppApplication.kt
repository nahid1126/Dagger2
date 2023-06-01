package com.nahid.dagger2

import android.app.Application
import com.nahid.dagger2.component.DaggerUserRegistrationComponent
import com.nahid.dagger2.component.UserRegistrationComponent

class AppApplication:Application() {
    lateinit var userRegistrationComponent: UserRegistrationComponent
    override fun onCreate() {
        super.onCreate()
        userRegistrationComponent = DaggerUserRegistrationComponent.factory().create(3)
    }
}