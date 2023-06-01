package com.nahid.dagger2.services

import android.util.Log
import javax.inject.Inject
import javax.inject.Singleton

private const val TAG = "NahidHasan"

interface NotificationServices {
    fun sendMail(to: String, from: String, body: String)
}
@Singleton
class EmailService @Inject constructor() : NotificationServices {
    override fun sendMail(to: String, from: String, body: String) {
        Log.d(TAG, "Email Send")
    }
}

class MessageServices(private val retryCount: Int) : NotificationServices {
    override fun sendMail(to: String, from: String, body: String) {
        Log.d(TAG, "message send: retryCount $retryCount")
    }

}
