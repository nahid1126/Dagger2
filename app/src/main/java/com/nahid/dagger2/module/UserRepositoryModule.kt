package com.nahid.dagger2.module

import com.nahid.dagger2.qualifier.DBQualifier
import com.nahid.dagger2.services.FirebaseRepository
import com.nahid.dagger2.services.LocalDBRepository
import com.nahid.dagger2.services.UserService
import dagger.Module
import dagger.Provides

@Module
class UserRepositoryModule {

    /*@Provides
    fun getFirebaseRepository(): UserService {
        return FirebaseRepository()
    }*/

    //dagger create this repository object
    @Provides
    fun getLocalRepository(localDBRepository: LocalDBRepository): UserService {
        return localDBRepository
    }

    @DBQualifier
    @Provides
    fun getFirebaseRepository(retryCount: Int): UserService {
        return FirebaseRepository(retryCount)
    }

    //if dagger provides object then use binds otherwise use provides
    /*   @Binds
       abstract fun getLocalRepository(localDBRepository: LocalDBRepository): UserService*/

}
