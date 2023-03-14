package com.nahid.dagger2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var userRegistrationService: UserRegistrationService

    @Inject
    lateinit var emailService: EmailService
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val component = DaggerUserRegistrationComponent.builder().build()
        component.injectService(this)
        userRegistrationService.registerUser("hasan@gmail.com", "123456")

        //emailService.sendMail("hasan@gmail.com", "no-reply@gmail.com", "uer registered")
    }
}