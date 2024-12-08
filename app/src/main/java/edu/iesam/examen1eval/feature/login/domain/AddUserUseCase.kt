package edu.iesam.examen1eval.feature.login.domain

import android.util.Log
import org.koin.core.annotation.Single

@Single
class AddUserUseCase(private val repository: UserRepository) {

    operator fun invoke(model: User): Boolean {
        val userCheck: User? = repository.findById(model.username)
        val username = model.username
        val password = model.password


        if (username.equals("") || password.equals("") ){

            Log.d("@dev", "Los datos introducidos no son validos")
            return false

        }else{

            if(userCheck == null){
                repository.addUser(model)
                Log.d("@dev", "WELCOME")

                return true

            }else{

                Log.d("@dev", "El usuario ya existe")
                return false

            }

        }

    }

}