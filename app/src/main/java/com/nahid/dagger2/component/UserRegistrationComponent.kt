package com.nahid.dagger2.component

import com.nahid.dagger2.MainActivity
import com.nahid.dagger2.module.NotificationModule
import com.nahid.dagger2.module.UserRepositoryModule
import com.nahid.dagger2.services.UserRegistrationService
import dagger.Component

@Component(modules = [UserRepositoryModule::class, NotificationModule::class])
interface UserRegistrationComponent {
     fun injectService(mainActivity: MainActivity)

}