package com.androiddevelopment.app.data.local.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.androiddevelopment.app.data.local.entity.VisitorUserEntity

@Dao
interface VisitorUserDao {
    @Insert
    suspend fun insert(visitorUserEntity: VisitorUserEntity)
    @Update
    suspend fun update(visitorUserEntity: VisitorUserEntity)
    @Delete
    suspend fun delete(visitorUserEntity: VisitorUserEntity)

    // Recuperar visitante pelo nome
    @Query("SELECT * FROM visitor_user WHERE nickname = :nickname")
    suspend fun getByNickname(nickname: String): VisitorUserEntity?

// use `@Query("select blá, blá, blá... ")` quando for criar uma consulta personalizada
}