package com.example.appimc

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val rootView = findViewById<androidx.constraintlayout.widget.ConstraintLayout>(R.id.main)
        ViewCompat.setOnApplyWindowInsetsListener(rootView) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val editPeso = findViewById<EditText>(R.id.editPeso)
        val editAltura = findViewById<EditText>(R.id.editAltura)
        val botao = findViewById<Button>(R.id.botao)
        val textoResultado = findViewById<TextView>(R.id.textoResultado)

        botao.setOnClickListener {
            val tamanhoPeso = editPeso.text.toString().toDoubleOrNull()
            val tamanhoAltura = editAltura.text.toString().toDoubleOrNull()

            if (tamanhoPeso != null && tamanhoAltura != null) {
                val resultado = tamanhoPeso / (tamanhoAltura * tamanhoAltura)

                textoResultado.text = when {
                    resultado < 18.5 -> "Abaixo do Peso"
                    resultado in 18.5..24.9 -> "Peso Normal"
                    resultado in 25.0..29.9 -> "Sobrepeso"
                    resultado in 30.0..34.9 -> "Obesidade"
                    resultado in 35.0..39.9 -> "Obesidade Grau II"
                    else -> "Obesidade Grau III"
                }
            } else {
                textoResultado.text = "Por favor, insira valores válidos"
            }
        }
    }
}
