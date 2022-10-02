package com.example.listify

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class shop : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shop)

        var place_order_btn = findViewById<Button>(R.id.place_order_btn)
        place_order_btn.setOnClickListener {
            startActivity(Intent(this@shop, order_page::class.java))
        }
    }
}