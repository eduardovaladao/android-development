package com.androiddevelopment.app.data.local.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey

@Entity(
    tableName = "decision_result",
    indices = [
        Index(value = ["id_product"]),
        Index(value = ["id_visitor"])
    ],
    foreignKeys = [
        ForeignKey(
            entity = ProductEntity::class,
            parentColumns = ["id"],
            childColumns = ["id_product"],
            onDelete = ForeignKey.CASCADE
        ),
        ForeignKey(
            entity = VisitorUserEntity::class,
            parentColumns = ["id"],
            childColumns = ["id_visitor"],
            onDelete = ForeignKey.CASCADE
        )
    ]
)
data class DecisionResultEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    @ColumnInfo(name = "id_product")
    val productId: Int,
    @ColumnInfo(name = "id_visitor")
    val visitorId: Int,
    val distanceToIdeal: Double,
    val distanceToAntiIdeal: Double,
    val closenessCoefficient: Double,
    val rankPosition: Int,
)
