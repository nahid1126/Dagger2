package com.nahid.dagger2.module

import com.nahid.dagger2.qualifier.MessageQualifier
import com.nahid.dagger2.services.EmailService
import com.nahid.dagger2.services.MessageServices
import com.nahid.dagger2.services.NotificationServices
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class NotificationModule {
    @MessageQualifier
    @Provides
    fun getMessageServices(retryCount: Int): NotificationServices {
        return MessageServices(retryCount)
    }

    @Singleton
    @Provides
    fun getMailServices(emailService: EmailService): NotificationServices {
        return emailService
    }

    //if dagger create this object it self then pass it's object and using @Binds else use @provides

    /* @Binds
     abstract fun getMailServices(emailService: EmailService): NotificationServices*/
}
