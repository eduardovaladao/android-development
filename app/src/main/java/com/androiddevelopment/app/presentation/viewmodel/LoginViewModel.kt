package com.androiddevelopment.app.presentation.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.androiddevelopment.app.domain.model.VisitorUser
import com.androiddevelopment.app.domain.usecase.GetVisitorUserUseCase
import com.androiddevelopment.app.domain.usecase.InsertVisitorUserUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import javax.inject.Inject

sealed interface VisitorUserUiState {
    data object Idle : VisitorUserUiState
    data object Loading : VisitorUserUiState
    data class Success(val visitorUser: VisitorUser?) : VisitorUserUiState
    data class Error(val message: String) : VisitorUserUiState
}

@HiltViewModel
class LoginViewModel @Inject constructor(
    // VIEWMODEL NÃO USA REPOSITORY (nesse caso)
    private val getVisitorUserUseCase: GetVisitorUserUseCase,
    private val insertVisitorUserUseCase: InsertVisitorUserUseCase
) : ViewModel() {
    private val _uiState = MutableStateFlow<VisitorUserUiState>(VisitorUserUiState.Idle)
    // a linha de cima serve para dar valor inicial ao "Fluxo de Estados"
    // e sim, é, o "ViewModel" uma state machine...
    val uiState: StateFlow<VisitorUserUiState> = _uiState.asStateFlow()

    fun loadVisitor(nickname: String) {
        if (nickname.isBlank()) {
            _uiState.value = VisitorUserUiState.Error("Apelido não encontrado")
            return
        }

        viewModelScope.launch {
            _uiState.value = VisitorUserUiState.Loading
            val visitorUser = getVisitorUserUseCase(nickname)
            try {
                _uiState.value = VisitorUserUiState.Success(visitorUser)
            } catch(e: Exception) {
                _uiState.value = VisitorUserUiState.Error(e.localizedMessage ?: "Erro desconhecido.")
            }
        }
    }

    fun signInVisitor(visitorUser: VisitorUser) {
        viewModelScope.launch {
            _uiState.value = VisitorUserUiState.Loading
            try {
                insertVisitorUserUseCase(visitorUser)
                _uiState.value = VisitorUserUiState.Success(visitorUser)
            } catch (e: Exception) {
                _uiState.value = VisitorUserUiState.Error(e.localizedMessage ?: "Erro desconhecido.")
            }
        }

    }
}