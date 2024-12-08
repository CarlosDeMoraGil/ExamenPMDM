package edu.iesam.examen1eval.feature.login.presentation

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.navigation.findNavController
import edu.iesam.examen1eval.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        botones()

    }

    fun botones(){

        findViewById<Button>(R.id.login).setOnClickListener{
            findViewById<TextView>(R.id.screen).text = "INICIA SESIÓN"
            findNavController(R.id.fragment_container).navigate(R.id.from_singup_to_login)
        }

        findViewById<Button>(R.id.singup).setOnClickListener{
            findViewById<TextView>(R.id.screen).text = "REGISTRATE"
        }

    }

}