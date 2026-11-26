package com.androiddevelopment.app.domain.model

data class Category (
    val id: Int,
    val name: String,
    val description: String,
    val criteria: List<Criterion>,
    val products: List<Product>
)