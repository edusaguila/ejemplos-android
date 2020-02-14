package com.example.ejemplo1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var result:EditText
    private val displayOperation by lazy(LazyThreadSafetyMode.NONE) { findViewById<TextView>(R.id.operation) }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        result=findViewById (R.id.resultado)
        resultado.setText("")
        displayOperation.text = ""
        //Numeros
        var boton0:Button=findViewById(R.id.boton0)
        var boton1:Button=findViewById(R.id.boton1)
        var boton2:Button=findViewById(R.id.boton2)
        var boton3:Button=findViewById(R.id.boton3)
        var boton4:Button=findViewById(R.id.boton4)
        var boton5:Button=findViewById(R.id.boton5)
        var boton6:Button=findViewById(R.id.boton6)
        var boton7:Button=findViewById(R.id.boton7)
        var boton8:Button=findViewById(R.id.boton8)
        var boton9:Button=findViewById(R.id.boton9)
        var botonentre:Button=findViewById(R.id.botonentre)
        var botonpor:Button=findViewById(R.id.botonpor)
        var botonmas:Button=findViewById(R.id.botonmas)
        var botonmenos:Button=findViewById(R.id.botonmenos)
        var botonigual:Button=findViewById(R.id.botonigual)

        //ClickListener
        var listener = View.OnClickListener { v ->
          val b = v as Button
         resultado.append(b.text)
          }
        boton0.setOnClickListener(listener)
        boton1.setOnClickListener(listener)
        boton2.setOnClickListener(listener)
        boton3.setOnClickListener(listener)
        boton4.setOnClickListener(listener)
        boton5.setOnClickListener(listener)
        boton6.setOnClickListener(listener)
        boton7.setOnClickListener(listener)
        boton8.setOnClickListener(listener)
        boton9.setOnClickListener(listener)

        var listener2 = View.OnClickListener { v ->
            val b = v as Button
            operation.setText(b.text)
        }
        botonentre.setOnClickListener(listener2)
        botonpor.setOnClickListener(listener2)
        botonmas.setOnClickListener(listener2)
        botonmenos.setOnClickListener(listener2)
        botonigual.setOnClickListener(listener2)

    }
}