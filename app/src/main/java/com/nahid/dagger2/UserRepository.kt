package com.nahid.dagger2

import android.util.Log

private const val TAG = "UserRepository"

class UserRepository {

    fun saveUser(email: String, pass: String) {
        Log.d(TAG, "user saved successful!")
    }
}