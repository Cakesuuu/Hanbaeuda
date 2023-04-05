package com.cakedev.hanbaeuda

import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.TypedValue
import android.view.View
import android.view.View.OnClickListener
import android.widget.Button
import android.widget.ProgressBar
import android.widget.TextView
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintAttribute
import androidx.core.content.ContextCompat

class Writing_Quiz_Mode : AppCompatActivity(), OnClickListener {

    private var mCurrentPosition: Int = 1
    private var mQuestionsList: ArrayList<questions_data>? = null
    private var mSelectedOptionPosition: Int = 0
    private var mCorrectAnswer: Int = 0
    private var mUsername: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_writing_quiz_mode)

        mUsername = intent.getStringExtra(ConstantsWriting.username)

        val submit = findViewById<Button>(R.id.writing_submit_button)

        mQuestionsList = ConstantsWriting.getQuestions()

        setQuestion()

        submit.setOnClickListener(this)

    }

    private fun reinstate(){

        val option1 = findViewById<TextView>(R.id.optionone)
        val option2 = findViewById<TextView>(R.id.optiontwo)
        val option3 = findViewById<TextView>(R.id.optionthree)
        val option4 = findViewById<TextView>(R.id.optionfour)

        option1.setOnClickListener(this)
        option2.setOnClickListener(this)
        option3.setOnClickListener(this)
        option4.setOnClickListener(this)
    }

    private fun setQuestion() {
        reinstate()

        val submit = findViewById<Button>(R.id.writing_submit_button)

        val question = mQuestionsList!![mCurrentPosition - 1]

        defaultOptionsView()

        if (mCurrentPosition == mQuestionsList!!.size){
            submit.text = "Finish"
        } else {
            submit.text = "Submit"
        }

        val screen_progress_bar = findViewById<ProgressBar>(R.id.progress_bar)
        val screen_progress_indicator = findViewById<TextView>(R.id.progress_indicator)
        val question_onscreen = findViewById<TextView>(R.id.question_main)
        val option1 = findViewById<TextView>(R.id.optionone)
        val option2 = findViewById<TextView>(R.id.optiontwo)
        val option3 = findViewById<TextView>(R.id.optionthree)
        val option4 = findViewById<TextView>(R.id.optionfour)

        screen_progress_bar?.progress = mCurrentPosition
        screen_progress_indicator?.text = "$mCurrentPosition" + " / " + screen_progress_bar?.max

        question_onscreen?.text = question!!.question

        if (question.ansOne.length <= 5) {
            option1?.setTextSize(TypedValue.COMPLEX_UNIT_SP, 30F)
            option1?.text = question.ansOne
        } else if (question.ansOne.length <= 10) {
            option1?.setTextSize(TypedValue.COMPLEX_UNIT_SP, 25F)
            option1?.text = question.ansOne
        } else if (question.ansOne.length <= 15) {
            option1?.setTextSize(TypedValue.COMPLEX_UNIT_SP, 23F)
            option1?.text = question.ansOne
        } else {
            option1?.setTextSize(TypedValue.COMPLEX_UNIT_SP, 20F)
            option1?.text = question.ansOne
        }

        if (question.ansTwo.length <= 5) {
            option2?.setTextSize(TypedValue.COMPLEX_UNIT_SP, 30F)
            option2?.text = question.ansTwo
        } else if (question.ansTwo.length <= 10) {
            option2?.setTextSize(TypedValue.COMPLEX_UNIT_SP, 25F)
            option2?.text = question.ansTwo
        } else if (question.ansTwo.length <= 15) {
            option2?.setTextSize(TypedValue.COMPLEX_UNIT_SP, 23F)
            option2?.text = question.ansTwo
        } else {
            option2?.setTextSize(TypedValue.COMPLEX_UNIT_SP, 20F)
            option2?.text = question.ansTwo
        }

        if (question.ansThree.length <= 5) {
            option3?.setTextSize(TypedValue.COMPLEX_UNIT_SP, 30F)
            option3?.text = question.ansThree
        } else if (question.ansThree.length <= 10) {
            option3?.setTextSize(TypedValue.COMPLEX_UNIT_SP, 25F)
            option3?.text = question.ansThree
        } else if (question.ansThree.length <= 15) {
            option3?.setTextSize(TypedValue.COMPLEX_UNIT_SP, 23F)
            option3?.text = question.ansThree
        } else {
            option3?.setTextSize(TypedValue.COMPLEX_UNIT_SP, 20F)
            option3?.text = question.ansThree
        }

        if (question.ansFour.length <= 5) {
            option4?.setTextSize(TypedValue.COMPLEX_UNIT_SP, 30F)
            option4?.text = question.ansFour
        } else if (question.ansFour.length <= 10) {
            option4?.setTextSize(TypedValue.COMPLEX_UNIT_SP, 25F)
            option4?.text = question.ansFour
        } else if (question.ansFour.length <= 15) {
            option4?.setTextSize(TypedValue.COMPLEX_UNIT_SP, 23F)
            option4?.text = question.ansFour
        } else {
            option4?.setTextSize(TypedValue.COMPLEX_UNIT_SP, 20F)
            option4?.text = question.ansFour
        }

    }

    private fun defaultOptionsView(){
        val options = ArrayList<TextView>()

        val option1 = findViewById<TextView>(R.id.optionone)
        val option2 = findViewById<TextView>(R.id.optiontwo)
        val option3 = findViewById<TextView>(R.id.optionthree)
        val option4 = findViewById<TextView>(R.id.optionfour)

        options.add(0, option1)
        options.add(1, option2)
        options.add(2, option3)
        options.add(3, option4)

        for (option in options){
            option?.setTextColor(Color.parseColor("#FFFFFF"))
            option?.background = ContextCompat.getDrawable(this ,R.drawable.corner_background)
        }
    }

    override fun onClick(v: View?) {

        val option1 = findViewById<TextView>(R.id.optionone)
        val option2 = findViewById<TextView>(R.id.optiontwo)
        val option3 = findViewById<TextView>(R.id.optionthree)
        val option4 = findViewById<TextView>(R.id.optionfour)
        val submit = findViewById<Button>(R.id.writing_submit_button)

        when(v?.id){
            R.id.optionone ->{
                selectedOptionView(option1, 1)
            }
            R.id.optiontwo ->{
                selectedOptionView(option2, 2)
            }
            R.id.optionthree ->{
                selectedOptionView(option3, 3)
            }
            R.id.optionfour ->{
                selectedOptionView(option4, 4)
            }
            R.id.writing_submit_button ->{
                if(mSelectedOptionPosition == 0){
                    mCurrentPosition++

                    when{
                        mCurrentPosition <= mQuestionsList!!.size ->{
                            setQuestion()
                        } else ->{
                            val info_dump = Intent(this, Results_Page::class.java)
                            info_dump.putExtra(ConstantsWriting.username, mUsername)
                            info_dump.putExtra(ConstantsWriting.score, mCorrectAnswer)
                            info_dump.putExtra(ConstantsWriting.total_questions, mQuestionsList!!.size)
                            startActivity(info_dump)
                            finish()
                        }
                    }
                } else {
                    val questions = mQuestionsList?.get(mCurrentPosition - 1)
                    if(questions!!.RightAnswer == mSelectedOptionPosition){
                        mCorrectAnswer++
                    }

                    if(mCurrentPosition == mQuestionsList!!.size){
                        submit.text = "Finish"
                    } else {
                        submit.text = "Next Question"
                        option1.setOnClickListener(null)
                        option2.setOnClickListener(null)
                        option3.setOnClickListener(null)
                        option4.setOnClickListener(null)
                    }
                    mSelectedOptionPosition = 0
                }
            }
        }
    }

    private fun selectedOptionView(tv: TextView, selectedOptionNum: Int){
        defaultOptionsView()
        mSelectedOptionPosition = selectedOptionNum

        tv.setTextColor(Color.parseColor("#363A43"))
        tv.background = ContextCompat.getDrawable(this ,R.drawable.ye_corner_background)

    }

}