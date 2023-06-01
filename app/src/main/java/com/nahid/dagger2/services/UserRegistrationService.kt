package com.nahid.dagger2.services

import com.nahid.dagger2.qualifier.DBQualifier
import com.nahid.dagger2.qualifier.MessageQualifier
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class UserRegistrationService @Inject constructor(
    @DBQualifier private val userService: UserService,
    @MessageQualifier private val notificationServices: NotificationServices
) {
    fun registerUser(email: String, pass: String) {
        userService.saveUser(email, pass)
        notificationServices.sendMail(email, "no-reply@gmail.com", "uer registered")
    }
}