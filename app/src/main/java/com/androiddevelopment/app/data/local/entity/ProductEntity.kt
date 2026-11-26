package com.androiddevelopment.app.data.local.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey

@Entity(
    tableName = "product",
    indices = [
        Index(value = ["name"], unique = true), // o nome não se repete
        Index(value = ["id_category"])
    ],
    foreignKeys = [
        ForeignKey(
            entity = CategoryEntity::class,
            parentColumns = ["id"],
            childColumns = ["id_category"],
            onDelete = ForeignKey.CASCADE
        )
    ]
)
data class ProductEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val name: String,
    val manufacturer: String,
    val model: String,
    @ColumnInfo(name = "id_category")
    val categoryId: Int
)