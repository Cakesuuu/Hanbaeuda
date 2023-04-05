package com.cakedev.hanbaeuda

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class Menu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        //Writing Button
        findViewById<Button>(R.id.WritingButton)
        .setOnClickListener{
            val fire = android.content.Intent(this, Writing::class.java)
            startActivity(fire)
        }

        //Reading Button
        findViewById<Button>(R.id.ReadingButton)
        .setOnClickListener{
            val fire = android.content.Intent(this, Reading::class.java)
            startActivity(fire)
        }

        //RoH Button
        findViewById<Button>(R.id.RoHButton)
        .setOnClickListener{
            val fire = android.content.Intent(this, RoH::class.java)
            startActivity(fire)
        }

        findViewById<Button>(R.id.to_credits)
            .setOnClickListener{
                val fire = android.content.Intent(this, Credits::class.java)
                startActivity(fire)
            }

        val versionbanner = findViewById<TextView>(R.id.version_banner)
        versionbanner.setText("Version " + BuildConfig.VERSION_NAME)

    }
}