package com.nahid.dagger2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val component = DaggerUserRegistrationComponent.builder().build()

        val userRegistrationService = component.getUserRegistrationService()
        userRegistrationService.registerUser("hasan@gmail.com", "123456")

        val emailServices = component.getMailServices()
        emailServices.sendMail("hasan@gmail.com", "no-reply@gmail.com", "uer registered")
    }
}