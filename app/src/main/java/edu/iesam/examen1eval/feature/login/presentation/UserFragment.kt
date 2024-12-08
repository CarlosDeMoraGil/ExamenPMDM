package edu.iesam.examen1eval.feature.login.presentation

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import edu.iesam.examen1eval.databinding.FragmentLoginBinding
import edu.iesam.examen1eval.feature.login.domain.User
import org.koin.androidx.viewmodel.ext.android.viewModel

class UserFragment : Fragment() {

    private var _binding: FragmentLoginBinding? = null
    private val binding: FragmentLoginBinding get() = _binding!!

    private val viewModel: AddUserViewModel by viewModel()

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

    fun bindData() {
        binding.apply {
            action.setOnClickListener {

                var usernameBind: String = username.text.toString()

                var passwordBind: String = password.text.toString()

                Log.d("@dev", "$usernameBind $passwordBind")

               viewModel.addUser(User(usernameBind, passwordBind))


            }

        }
    }


}