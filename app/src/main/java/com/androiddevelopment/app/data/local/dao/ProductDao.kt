package com.androiddevelopment.app.data.local.dao

import androidx.room.Dao
import androidx.room.Query
import com.androiddevelopment.app.data.local.entity.ProductEntity

@Dao
interface ProductDao {
    @Query("SELECT * FROM product WHERE id = :id")
    suspend fun getById(id: Int): ProductEntity?

    @Query("SELECT * FROM product WHERE id_category = :categoryId")
    suspend fun getAllProductsFromCategory(categoryId: Int): List<ProductEntity>?
}
