package edu.iesam.examen1eval.feature.login.domain

import android.util.Log
import org.koin.core.annotation.Single

@Single
class GetUserUseCase (private val repository: UserRepository) {

    operator fun invoke(username: String): User?{

        val user = repository.findById(username)

        return if(user != null){
            user

        }else{
            Log.d("@dev", "El usuario introducido no existe")
            null
        }

    }

}