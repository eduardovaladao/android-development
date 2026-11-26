package com.androiddevelopment.app.domain.model

data class Criterion(
    val id: Int,
    val name: String,
    val unit: String,
    val description: String,
    val type: TipoCriterio,
)
