package edu.iesam.examen1eval.feature.login.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import edu.iesam.examen1eval.feature.login.domain.AddUserUseCase
import edu.iesam.examen1eval.feature.login.domain.User
import org.koin.android.annotation.KoinViewModel

@KoinViewModel
class AddUserViewModel(private val addUserUseCase: AddUserUseCase) : ViewModel() {

    private val _uiState = MutableLiveData<UiState>()
    private val uistate: LiveData<UiState> = _uiState

    fun addUser(user: User): Boolean {
        return addUserUseCase.invoke(user)
    }

    data class UiState(
        val isLoaing: Boolean = false,

        )

}