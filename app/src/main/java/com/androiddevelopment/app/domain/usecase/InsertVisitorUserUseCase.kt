package com.androiddevelopment.app.domain.usecase

import com.androiddevelopment.app.domain.model.VisitorUser
import com.androiddevelopment.app.domain.repository.VisitorUserRepository
import javax.inject.Inject

class InsertVisitorUserUseCase @Inject constructor(
    private val repo: VisitorUserRepository
) {
    //isso aqui serve pra rodar uma função a partir da classe
    // que é chamada, sem usar por um médoto ou coisas assim
    suspend operator fun invoke(visitorUser: VisitorUser) {
        repo.insert(visitorUser)
    }
}