package com.example.refrigerador

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnIr:Button = findViewById(R.id.btnIr)
        val btnIr2:Button = findViewById(R.id.btnIr2)

        btnIr.setOnClickListener{
            intent= Intent(this, vista_2::class.java)
            startActivity(intent)
        }
        btnIr2.setOnClickListener{
            intent= Intent(this, register::class.java)
            startActivity(intent)
        }

    }

}