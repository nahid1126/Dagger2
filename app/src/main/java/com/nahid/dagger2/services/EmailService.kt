package com.nahid.dagger2.services

import android.util.Log
import javax.inject.Inject

private const val TAG = "NahidHasan"

interface NotificationServices {
    fun sendMail(to: String, from: String, body: String)
}

class EmailService @Inject constructor() : NotificationServices {
    override fun sendMail(to: String, from: String, body: String) {
        Log.d(TAG, "Email Send")
    }
}

class MessageServices : NotificationServices {
    override fun sendMail(to: String, from: String, body: String) {
        Log.d(TAG, "message send: ")
    }

}
