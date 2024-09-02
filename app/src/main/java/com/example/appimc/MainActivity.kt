package com.example.appimc

import android.os.Bundle
import android.util.Log
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

            if (tamanhoPeso != null && tamanhoAltura !=null){

                val resultado = tamanhoPeso / (tamanhoAltura*tamanhoAltura)

                if (resultado < 18.5){
                    textoResultado.text = "Abaixo do Peso"
                } else if (resultado >= 18.5 && resultado <= 24.9){
                    textoResultado.text = "Peso Normal"
                }else if (resultado >= 25 && resultado <= 29.9 ){
                    textoResultado.text = "Sobrepeso"
                }else if (resultado >= 30 && resultado <= 34.9){
                    textoResultado.text = "Obesidade"
                }else if (resultado >= 35 && resultado <= 39.9){
                    textoResultado.text = "Obesidade Grau II"
                }else if (resultado > 40){
                    textoResultado.text = "Obesidade Grau III"
                }

            }else {
                textoResultado.text = "Por favor, insira valores válidos"

            }
        }

    }
}
