package com.androiddevelopment.app.data.local.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.androiddevelopment.app.data.local.entity.DecisionResultEntity

@Dao
interface DecisionResultDao {
    // Gereado pelo Android Studio Built-in Agent
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(decisionResultEntity: DecisionResultEntity)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAll(decisionResults: List<DecisionResultEntity>)

    // @Update
    // suspend fun update(decisionResultEntity: DecisionResultEntity)

    @Delete
    suspend fun delete(decisionResultEntity: DecisionResultEntity)

    @Query("DELETE FROM decision_result")
    suspend fun deleteAll()

    @Query("SELECT * FROM decision_result ORDER BY rankPosition ASC")
    suspend fun getAllOrderedByRank(): List<DecisionResultEntity>

    @Query("SELECT * FROM decision_result WHERE id = :id")
    suspend fun getById(id: Int): DecisionResultEntity?

    @Query("SELECT * FROM decision_result WHERE id_visitor = :visitorId")
    suspend fun getByVisitorId(visitorId: Int): DecisionResultEntity?
}
