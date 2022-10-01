package com.example.refrigerador

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class register : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val can: Button = findViewById(R.id.can)
        val save: Button = findViewById(R.id.save)

        can.setOnClickListener{
            intent= Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        save.setOnClickListener{
            intent= Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}