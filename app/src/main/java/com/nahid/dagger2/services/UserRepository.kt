package com.nahid.dagger2.services

import android.util.Log
import javax.inject.Inject

private const val TAG = "UserRepository"

interface UserService{
    fun saveUser(email: String, pass: String)
}
class LocalDBRepository @Inject constructor(): UserService {
    override fun saveUser(email: String, pass: String) {
        Log.d(TAG, "user saved successful in DB!")
    }
}

class FirebaseRepository: UserService {
    override fun saveUser(email: String, pass: String) {
        Log.d(TAG, "user saved successful in firebase!")    }
}