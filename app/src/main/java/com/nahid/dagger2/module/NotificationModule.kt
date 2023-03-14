package com.nahid.dagger2.module

import com.nahid.dagger2.services.EmailService
import com.nahid.dagger2.services.MessageServices
import com.nahid.dagger2.services.NotificationServices
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
abstract class NotificationModule {

  /*  @Provides
    fun getMessageServices():NotificationServices{
        return MessageServices()
    }*/

    @Binds
    abstract fun getMailServices(emailService: EmailService):NotificationServices
}