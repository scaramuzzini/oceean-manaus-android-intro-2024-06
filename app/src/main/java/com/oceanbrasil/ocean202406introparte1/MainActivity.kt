package com.oceanbrasil.ocean202406introparte1

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button2 = findViewById<Button>(R.id.button2)
        val nomeDoUsuario = findViewById<EditText>(R.id.nomeDoUsuario)
        val nomeDigitado = findViewById<TextView>(R.id.nomeDigitado)

        button2.setOnClickListener {
            //Log.d("oceanbrasil", "O texto do botao e:"+button2.text.toString())
            Toast.makeText(this, nomeDoUsuario.text, Toast.LENGTH_LONG).show()
            val nome = nomeDoUsuario.text.toString()
            nomeDigitado.text = "O nome digitado foi: $nome"
        }
    }
}
