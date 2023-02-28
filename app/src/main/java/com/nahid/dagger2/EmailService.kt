package com.nahid.dagger2

import android.util.Log

private const val TAG = "EmailService"

class EmailService {
    fun sendMail(to: String, from: String, body: String) {
        Log.d(TAG, "Email Send")
    }
}