package com.example.refrigerador

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class vista_3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vista3)

        val btnRegresar:Button = findViewById(R.id.regresar)
            // val btnCerrar:Button = findViewById(R.id.cerrar)

        btnRegresar.setOnClickListener{
            intent= Intent(this, vista_2::class.java)
            startActivity(intent)
        }

        //btnCerrar.setOnClickListener{
            //intent= Intent(this, MainActivity::class.java)
           // startActivity(intent)
       // }
    }
}