package com.androiddevelopment.app.data.local.database

import androidx.room.Database
import androidx.room.RoomDatabase

import com.androiddevelopment.app.data.local.dao.*
import com.androiddevelopment.app.data.local.entity.*

@Database(
        entities = [
                VisitorUserEntity::class,
                ProductEntity::class,
                CategoryEntity::class,
                DecisionResultEntity::class
        ],
        version = 1,
        exportSchema = true
)
abstract class AppDatabase : RoomDatabase() {
    abstract fun visitorUserDao() : VisitorUserDao

    abstract fun productDao() : ProductDao

    abstract fun categoryDao(): CategoryDao
    abstract fun decisionResultDao(): DecisionResultDao
}
