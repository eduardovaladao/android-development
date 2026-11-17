package com.androiddevelopment.app.data.local.database

import androidx.room.Database
import androidx.room.RoomDatabase

import com.androiddevelopment.app.data.local.dao.VisitorUserDao
import com.androiddevelopment.app.data.local.entity.CategoryEntity
import com.androiddevelopment.app.data.local.entity.ProductEntity
import com.androiddevelopment.app.data.local.entity.VisitorUserEntity

@Database(
        entities = [
                VisitorUserEntity::class,
                CategoryEntity::class,
                ProductEntity::class
        ],
        version = 1,
        exportSchema = true
)
abstract class AppDatabase : RoomDatabase() {
    abstract fun visitorUserDao() : VisitorUserDao
}
