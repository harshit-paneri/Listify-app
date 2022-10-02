package com.example.listify

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.SearchView

class LandingPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_landing_page)
        val image = findViewById<ImageView>(R.id.shop_img)
        image.setOnClickListener {
            startActivity(Intent(this@LandingPage, shop::class.java))

        }
        val image2 = findViewById<ImageView>(R.id.imageButton2)
        image2.setOnClickListener {
            startActivity(Intent(this@LandingPage, shop::class.java))

        }
        val image3 = findViewById<ImageView>(R.id.imageButton3)
        image3.setOnClickListener {
            startActivity(Intent(this@LandingPage, shop::class.java))

        }
        val image4 = findViewById<ImageView>(R.id.imageButton4)
        image4.setOnClickListener {
            startActivity(Intent(this@LandingPage, shop::class.java))

        }
            var login_btn = findViewById<Button>(R.id.nearby_me)
            login_btn.setOnClickListener {
                startActivity(Intent(this@LandingPage, map::class.java))
            }
    }
}