package com.androiddevelopment.app.data.local.entity;

import androidx.room.Entity;
import androidx.room.Index
import androidx.room.PrimaryKey

@Entity(
    tableName = "visitor_user",
    indices = [Index(value = ["nickname"], unique = true)] // o nome não se repete
)
data class VisitorUserEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val nickname: String,
)
