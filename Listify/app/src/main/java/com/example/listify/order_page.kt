package com.example.listify

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class order_page : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order_page)

        var login_btn = findViewById<Button>(R.id.confirm_order_btn)
        login_btn.setOnClickListener {
            startActivity(Intent(this@order_page, order_placed::class.java))
        }
    }
}