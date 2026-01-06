package com.cebim.app

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnGiris = findViewById<Button>(R.id.btnGiris)
        btnGiris.setOnClickListener {
            Toast.makeText(this, "Ben Cebim'e Hoşgeldiniz!", Toast.LENGTH_SHORT).show()
        }
    }
}
