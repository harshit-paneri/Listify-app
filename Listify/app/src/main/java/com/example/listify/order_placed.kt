package com.example.listify

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class order_placed : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order_placed)


        var login_btn = findViewById<Button>(R.id.Proceed)
        login_btn.setOnClickListener {
            startActivity(Intent(this@order_placed, LandingPage::class.java))
        }
    }
}