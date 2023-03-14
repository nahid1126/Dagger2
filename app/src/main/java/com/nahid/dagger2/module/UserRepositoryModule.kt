package com.nahid.dagger2.module

import com.nahid.dagger2.services.FirebaseRepository
import com.nahid.dagger2.services.LocalDBRepository
import com.nahid.dagger2.services.UserService
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
 class UserRepositoryModule {

    @Provides
    fun getFirebaseRepository(): UserService {
        return FirebaseRepository()
    }

/*    @Binds
    abstract fun getLocalRepository(localDBRepository: LocalDBRepository): UserService*/
}