package com.androiddevelopment.app.data.local.dao

import androidx.room.Dao
import androidx.room.Query
import com.androiddevelopment.app.data.local.entity.CategoryEntity

@Dao
interface CategoryDao {
    @Query("SELECT * FROM category")
    suspend fun getAllCategories(): List<CategoryEntity>
}
