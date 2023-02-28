package com.nahid.dagger2

import android.util.Log
import javax.inject.Inject

private const val TAG = "UserRepository"

class UserRepository @Inject constructor(){

    fun saveUser(email: String, pass: String) {
        Log.d(TAG, "user saved successful!")
    }
}