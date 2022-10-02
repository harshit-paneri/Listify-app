package com.example.listify

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class welcome2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome2)
        var login_btn = findViewById<Button>(R.id.login_button)
        login_btn.setOnClickListener {
        startActivity(Intent(this@welcome2, Login::class.java))
    }
    }
}