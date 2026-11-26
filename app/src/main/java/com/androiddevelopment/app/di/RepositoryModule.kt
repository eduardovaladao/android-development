package com.androiddevelopment.app.di

import com.androiddevelopment.app.data.repository.CategoryRepositoryImpl
import com.androiddevelopment.app.data.repository.DecisionResultRepositoryImpl
import com.androiddevelopment.app.data.repository.ProductRepositoryImpl
import com.androiddevelopment.app.data.repository.VisitorUserRepositoryImpl
import com.androiddevelopment.app.domain.repository.CategoryRepository
import com.androiddevelopment.app.domain.repository.DecisionResultRepository
import com.androiddevelopment.app.domain.repository.ProductRepository
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

    @Binds
    @Singleton
    abstract fun bindProductRepository(
        impl: ProductRepositoryImpl
    ): ProductRepository

    @Binds
    @Singleton
    abstract fun bindCategoryRepository(
        impl: CategoryRepositoryImpl
    ): CategoryRepository

    @Binds
    @Singleton
    abstract fun bindDecisionResultRepository(
        impl: DecisionResultRepositoryImpl
    ): DecisionResultRepository
}
