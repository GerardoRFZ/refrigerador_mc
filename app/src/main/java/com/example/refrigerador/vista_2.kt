package com.example.refrigerador

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class vista_2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vista2)

        val btnRecetas:Button = findViewById(R.id.recetas)

        btnRecetas.setOnClickListener{
            intent= Intent(this, vista_3::class.java)
            startActivity(intent)
        }



    }
}