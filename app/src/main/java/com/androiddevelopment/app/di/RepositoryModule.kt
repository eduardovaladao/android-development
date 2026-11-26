package com.androiddevelopment.app.di

import com.androiddevelopment.app.data.repository.VisitorUserRepositoryImpl
import com.androiddevelopment.app.domain.model.VisitorUser
import com.androiddevelopment.app.domain.repository.VisitorUserRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindVisitorUserRepository(
        impl: VisitorUserRepositoryImpl
    ): VisitorUserRepository


}