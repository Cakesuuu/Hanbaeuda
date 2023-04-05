package com.cakedev.hanbaeuda

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Results_Page : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_results_page)

        val user_name = findViewById<TextView>(R.id.results_username)
        val score_value = findViewById<TextView>(R.id.test_score)
        val return_menu = findViewById<Button>(R.id.go_back)
        val answer_key = findViewById<Button>(R.id.see_results)
        val comment = findViewById<TextView>(R.id.test_comment)

        val username = intent.getStringExtra(ConstantsReading.username)
        val total_questions = intent.getIntExtra(ConstantsReading.total_questions, 0)
        val correct_answers = intent.getIntExtra(ConstantsReading.score, 0)
        val bangkol = intent.getStringExtra(ConstantsReading.test)

        user_name.text = username
        score_value.text = "You scored $correct_answers out of $total_questions"

        if (correct_answers == 0){
            comment.text = "Oh no! Let\'s study harder!"
        } else if (correct_answers <= 3) {
            comment.text = "We can do this! Let\'s keep going!"
        } else if (correct_answers <= 6) {
            comment.text = "Woah! You're getting good!"
        } else if (correct_answers <= 9) {
            comment.text = "Good job! You\'re almost there!"
        } else if (correct_answers >= 10){
            comment.text = "WHOA! PERFECT SCORE!"
        } else {
            comment.text = "Brah..."
        }



        if (bangkol == "Reading"){
            answer_key.setOnClickListener{
                val fire = Intent(this, Answer_Key_Reading::class.java)
                startActivity(fire)
                finish()
            }
        } else {
            answer_key.setOnClickListener {
                val fire = Intent(this, Answer_Key_Writing::class.java)
                startActivity(fire)
                finish()
            }
        }

        return_menu.setOnClickListener{
            val fire = Intent(this, Menu::class.java)
            startActivity(fire)
            finish()
        }
    }
}