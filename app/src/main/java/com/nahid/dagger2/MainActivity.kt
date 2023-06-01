package com.nahid.dagger2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.nahid.dagger2.services.EmailService
import com.nahid.dagger2.services.UserRegistrationService
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var userRegistrationService: UserRegistrationService

    @Inject
    lateinit var maiService: EmailService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val component = (application as AppApplication).userRegistrationComponent
        component.injectService(this)
        userRegistrationService.registerUser("hasan@gmail.com", "123456")
    }
}