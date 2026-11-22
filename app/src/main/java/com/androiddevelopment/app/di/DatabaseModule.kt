package com.androiddevelopment.app.di

import android.content.Context
import androidx.room.Room
import com.androiddevelopment.app.MainApplication
import com.androiddevelopment.app.data.local.dao.VisitorUserDao
import com.androiddevelopment.app.data.local.database.AppDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {

    @Provides
    @Singleton
    fun provideAppDatabase(
        @ApplicationContext context: Context
    ): AppDatabase {
        return Room.databaseBuilder(
            context.applicationContext,
            AppDatabase::class.java,
            "app_database"
        ).build()
    }

    @Provides
    fun provideVisitorUserDao(
        database: AppDatabase
    ): VisitorUserDao {
        return database.visitorUserDao()
    }
}