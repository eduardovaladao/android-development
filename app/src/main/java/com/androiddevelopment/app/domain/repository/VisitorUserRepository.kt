package com.androiddevelopment.app.domain.repository

import com.androiddevelopment.app.domain.model.VisitorUser

interface VisitorUserRepository {
    suspend fun getByNickname(
        nickname: String
    ): VisitorUser?

    suspend fun insert(
        visitorUser: VisitorUser
    )
}