package com.androiddevelopment.app.domain.usecase

import com.androiddevelopment.app.domain.model.VisitorUser
import com.androiddevelopment.app.domain.repository.VisitorUserRepository
import javax.inject.Inject

class GetVisitorUserUseCase @Inject constructor(
    private val repo: VisitorUserRepository
) {
    suspend fun getByNickname(
        nickname: String
    ): VisitorUser? {
        return repo.getByNickname(nickname)
    }

    // Alternativa de uso
    suspend operator fun invoke(
        nickname: String
    ): VisitorUser? {
        return repo.getByNickname(nickname)
    }

// REGRA: este caso e uso pode retornar NULO!
// E quem vai tratar esse retorno
// é o "ViewModel do VisitorUser"
}