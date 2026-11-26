package com.androiddevelopment.app.domain.model

data class Product(
    val id: Int,
    val name: String,
    val manufacturer: String,
    val model: String,
    val evaluations: Map<String, Double> = emptyMap(),
)
