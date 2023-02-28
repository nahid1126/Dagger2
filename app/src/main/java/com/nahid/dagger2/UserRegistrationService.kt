package com.nahid.dagger2

class UserRegistrationService(
    private val userRepository: UserRepository,
    private val emailService: EmailService
) {

    fun registerUser(email: String, pass: String) {
        userRepository.saveUser(email, pass)
        emailService.sendMail(email, "no-reply@gmail.com", "uer registered")
    }
}