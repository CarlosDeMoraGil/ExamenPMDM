package edu.iesam.examen1eval.feature.login.presentation

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import edu.iesam.examen1eval.databinding.FragmentLoginBinding
import edu.iesam.examen1eval.feature.login.domain.User
import org.koin.androidx.viewmodel.ext.android.viewModel


class LogInFragment : Fragment() {

    private var _binding: FragmentLoginBinding? = null
    private val binding: FragmentLoginBinding get() = _binding!!

    private val viewModel: GetUserViewModel by viewModel()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentLoginBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        bindData()

    }

    fun bindData(){
        binding.apply {



            action.setOnClickListener{
                val username = username.text.toString()
                val password = password.text.toString()

                val user = viewModel.getUser(username)

                if(user?.password == password){
                    if(reminder.isChecked){
                        user.remember = true
                        binding.username.hint = user.username
                        binding.password.hint = user.password
                        reminder.isChecked

                    }else{
                        user.remember = false
                    }

                    Log.d("@dev", "INICIO DE SESION COMPLETADO")
                }else{
                    Log.d("@dev", "La contraseña es incorrecta")
                }
            }

        }


    }

}