package com.nahid.dagger2

import dagger.Component

@Component
interface UserRegistrationComponent {
    /*fun getUserRegistrationService(): UserRegistrationService

    fun getMailServices(): EmailService*/

    fun injectService(mainActivity: MainActivity)
}