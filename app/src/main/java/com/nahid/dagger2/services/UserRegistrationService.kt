package com.nahid.dagger2.services

import com.nahid.dagger2.qualifier.MessageQualifier
import javax.inject.Inject

class UserRegistrationService @Inject constructor(
    private val userService: UserService,
    @MessageQualifier private val notificationServices: NotificationServices
) {
    fun registerUser(email: String, pass: String) {
        userService.saveUser(email, pass)
        notificationServices.sendMail(email, "no-reply@gmail.com", "uer registered")
    }
}