package edu.iesam.examen1eval.feature.login.presentation

import androidx.lifecycle.ViewModel
import edu.iesam.examen1eval.feature.login.domain.GetUserUseCase
import edu.iesam.examen1eval.feature.login.domain.User
import org.koin.android.annotation.KoinViewModel

@KoinViewModel
class GetUserViewModel(private val getUserUseCase: GetUserUseCase) : ViewModel() {


    fun getUser(username: String): User? {
        return getUserUseCase.invoke(username)

    }

}