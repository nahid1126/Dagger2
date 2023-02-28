package com.nahid.dagger2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val userRepository = UserRepository()
        val emailService = EmailService()
        val userRegistrationService = UserRegistrationService(userRepository, emailService)
        userRegistrationService.registerUser("hasan@gmail.com", "123456")
    }
}