package com.cakedev.hanbaeuda

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.TextView

class Answer_Key_Writing : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_answer_key_writing)

        //INFOS
        data class answerKeyData (
            val answer: String,
            val question: String,
        )
        val blubAnswerKeyData = ArrayList<answerKeyData>()

        val exedata1 = answerKeyData(
            "안",
            "How do you write \"An\" in Hangul?"
        )
        val exedata2 = answerKeyData(
            "Silent",
            "What sound does the letter ㅇ make when it is at the beginning of a syllable block?"
        )
        val exedata3 = answerKeyData(
            "NG Sound",
            "What sound does the letter ㅇ make when it is at the end of a syllable block?"
        )
        val exedata4 = answerKeyData(
            "N",
            "What does the consonant \"ㄴ\" sounds similar to?"
        )
        val exedata5 = answerKeyData(
            "안녕하세요",
            "How do you write \"Annyeonghaseyo\" (Hello) with Korean letters?"
        )
        val exedata6 = answerKeyData(
            "Letter K",
            "What sound is the letter \"ㅋ\" similar to?"
        )
        val exedata7 = answerKeyData(
            "노래",
            "How do you write \"Norae\" (Music) in Korean?"
        )
        val exedata8 = answerKeyData(
            "삼성",
            "How do you write \"Samsung\" in Korean?"
        )
        val exedata9 = answerKeyData(
            "집",
            "How do you write \"Jib\" (House) in Korean?"
        )
        val exedata10 = answerKeyData(
            "예쁘다",
            "How do you write \"Yeppeuda\" (Pretty) in Korean?"
        )

        blubAnswerKeyData.add(exedata1)
        blubAnswerKeyData.add(exedata2)
        blubAnswerKeyData.add(exedata3)
        blubAnswerKeyData.add(exedata4)
        blubAnswerKeyData.add(exedata5)
        blubAnswerKeyData.add(exedata6)
        blubAnswerKeyData.add(exedata7)
        blubAnswerKeyData.add(exedata8)
        blubAnswerKeyData.add(exedata9)
        blubAnswerKeyData.add(exedata10)

        val default = "[ Tap to show Answer ]"

        val q1 = findViewById<TextView>(R.id.reading_question_1)
        val q2 = findViewById<TextView>(R.id.reading_question_2)
        val q3 = findViewById<TextView>(R.id.reading_question_3)
        val q4 = findViewById<TextView>(R.id.reading_question_4)
        val q5 = findViewById<TextView>(R.id.reading_question_5)
        val q6 = findViewById<TextView>(R.id.reading_question_6)
        val q7 = findViewById<TextView>(R.id.reading_question_7)
        val q8 = findViewById<TextView>(R.id.reading_question_8)
        val q9 = findViewById<TextView>(R.id.reading_question_9)
        val q10 = findViewById<TextView>(R.id.reading_question_10)


        val a1 = findViewById<TextView>(R.id.reading_question_answer_1)
        val a2 = findViewById<TextView>(R.id.reading_question_answer_2)
        val a3 = findViewById<TextView>(R.id.reading_question_answer_3)
        val a4 = findViewById<TextView>(R.id.reading_question_answer_4)
        val a5 = findViewById<TextView>(R.id.reading_question_answer_5)
        val a6 = findViewById<TextView>(R.id.reading_question_answer_6)
        val a7 = findViewById<TextView>(R.id.reading_question_answer_7)
        val a8 = findViewById<TextView>(R.id.reading_question_answer_8)
        val a9 = findViewById<TextView>(R.id.reading_question_answer_9)
        val a10 = findViewById<TextView>(R.id.reading_question_answer_10)

        val qa1lis = findViewById<LinearLayout>(R.id.qa1)
        val qa2lis = findViewById<LinearLayout>(R.id.qa2)
        val qa3lis = findViewById<LinearLayout>(R.id.qa3)
        val qa4lis = findViewById<LinearLayout>(R.id.qa4)
        val qa5lis = findViewById<LinearLayout>(R.id.qa5)
        val qa6lis = findViewById<LinearLayout>(R.id.qa6)
        val qa7lis = findViewById<LinearLayout>(R.id.qa7)
        val qa8lis = findViewById<LinearLayout>(R.id.qa8)
        val qa9lis = findViewById<LinearLayout>(R.id.qa9)
        val qa10lis = findViewById<LinearLayout>(R.id.qa10)

        q1.text = exedata1.question
        q2.text = exedata2.question
        q3.text = exedata3.question
        q4.text = exedata4.question
        q5.text = exedata5.question
        q6.text = exedata6.question
        q7.text = exedata7.question
        q8.text = exedata8.question
        q9.text = exedata9.question
        q10.text = exedata10.question

        //FUNCTIONS HERE
        var status1 = true
        var status2 = true
        var status3 = true
        var status4 = true
        var status5 = true
        var status6 = true
        var status7 = true
        var status8 = true
        var status9 = true
        var status10 = true

        qa1lis.setOnClickListener{
            val databag = exedata1
            if (status1 == true){
                a1.text = databag.answer
                status1 = false
            } else {
                a1.text = default
                status1 = true
            }
        }

        qa2lis.setOnClickListener{
            val databag = exedata2
            if (status2 == true){
                a2.text = databag.answer
                status2 = false
            } else {
                a2.text = default
                status2 = true
            }
        }

        qa3lis.setOnClickListener{
            val databag = exedata3
            if (status3 == true){
                a3.text = databag.answer
                status3 = false
            } else {
                a3.text = default
                status3 = true
            }
        }

        qa4lis.setOnClickListener{
            val databag = exedata4
            if (status4 == true){
                a4.text = databag.answer
                status4 = false
            } else {
                a4.text = default
                status4 = true
            }
        }

        qa4lis.setOnClickListener{
            val databag = exedata4
            if (status4 == true){
                a4.text = databag.answer
                status4 = false
            } else {
                a4.text = default
                status4 = true
            }
        }

        qa5lis.setOnClickListener{
            val databag = exedata5
            if (status5 == true){
                a5.text = databag.answer
                status5 = false
            } else {
                a5.text = default
                status5 = true
            }
        }

        qa6lis.setOnClickListener{
            val databag = exedata6
            if (status6 == true){
                a6.text = databag.answer
                status6 = false
            } else {
                a6.text = default
                status6 = true
            }
        }

        qa7lis.setOnClickListener{
            val databag = exedata7
            if (status7 == true){
                a7.text = databag.answer
                status7 = false
            } else {
                a7.text = default
                status7 = true
            }
        }

        qa8lis.setOnClickListener{
            val databag = exedata8
            if (status8 == true){
                a8.text = databag.answer
                status8 = false
            } else {
                a8.text = default
                status8 = true
            }
        }

        qa9lis.setOnClickListener{
            val databag = exedata9
            if (status9 == true){
                a9.text = databag.answer
                status9 = false
            } else {
                a9.text = default
                status9 = true
            }
        }

        qa10lis.setOnClickListener{
            val databag = exedata10
            if (status10 == true){
                a10.text = databag.answer
                status10 = false
            } else {
                a10.text = default
                status10 = true
            }
        }

    }
}