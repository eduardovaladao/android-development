package com.androiddevelopment.app.data.repository

import com.androiddevelopment.app.data.local.dao.VisitorUserDao
import com.androiddevelopment.app.data.local.database.AppDatabase
import com.androiddevelopment.app.data.local.entity.VisitorUserEntity
import com.androiddevelopment.app.domain.model.VisitorUser
import com.androiddevelopment.app.domain.repository.VisitorUserRepository
import javax.inject.Inject

class VisitorUserRepositoryImpl
@Inject constructor(
    private val dao: VisitorUserDao
) : VisitorUserRepository {
    override suspend fun getByNickname(nickname: String): VisitorUser? {
        // primeiro puxa a entity
        val entity = dao.getByNickname(nickname)
        // pra depois converter ela em model
        return entity?.let {
            VisitorUser(
                id = it.id,
                nickname = it.nickname
            )
        }
    }

    override suspend fun insert(visitorUser: VisitorUser) {
        // primeiro, criamos a entity
        val entity = VisitorUserEntity(
            id = visitorUser.id,
            nickname = visitorUser.nickname
        )
        // depois a inserimos no banco de dados
        dao.insert(entity)
    }

}
