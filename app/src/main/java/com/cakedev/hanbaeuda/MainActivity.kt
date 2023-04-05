package com.cakedev.hanbaeuda

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import android.os.Handler
import android.os.Looper
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Move to Menu Function
        fun begin() {
            val fire = Intent(this, Menu::class.java)

            startActivity(fire)
            finish()
        }

        //Timer
        Handler(Looper.getMainLooper()).postDelayed({
            begin()}, 2000)

    }
}