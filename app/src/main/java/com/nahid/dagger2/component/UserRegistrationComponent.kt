package com.nahid.dagger2.component

import com.nahid.dagger2.MainActivity
import com.nahid.dagger2.module.NotificationModule
import com.nahid.dagger2.module.UserRepositoryModule
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [UserRepositoryModule::class, NotificationModule::class])
interface UserRegistrationComponent {
    fun injectService(mainActivity: MainActivity)

    @Component.Factory
    interface Factory {
        fun create(@BindsInstance retryCount: Int): UserRegistrationComponent
    }

}