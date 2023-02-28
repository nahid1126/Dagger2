package com.nahid.dagger2

import android.util.Log
import javax.inject.Inject

private const val TAG = "EmailService"

class EmailService @Inject constructor() {
    fun sendMail(to: String, from: String, body: String) {
        Log.d(TAG, "Email Send")
    }
}