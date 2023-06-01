package com.nahid.dagger2.services

import android.util.Log
import javax.inject.Inject

private const val TAG = "NahidHasan"
/*class LocalDBRepository @Inject constructor() {
     fun saveUser(email: String, pass: String) {
        Log.d(TAG, "user saved successful in DB!")
    }
}*/
interface UserService{
    fun saveUser(email: String, pass: String)
}
class LocalDBRepository @Inject constructor(): UserService {
    override fun saveUser(email: String, pass: String) {
        Log.d(TAG, "user saved successful in DB!")
    }
}

class FirebaseRepository(private val retryCount: Int) : UserService {
    override fun saveUser(email: String, pass: String) {
        Log.d(TAG, "user saved successful in firebase! $retryCount")    }
}
