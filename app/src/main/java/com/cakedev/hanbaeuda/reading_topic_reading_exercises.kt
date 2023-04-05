package com.cakedev.hanbaeuda

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import org.w3c.dom.Text

class reading_topic_reading_exercises : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_reading_topic_reading_exercises, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //INFOS
        data class exercisedata (
            val default: String,
            val romanized: String,
        )
        val readingexercisedata = ArrayList<exercisedata>()

        val exedata1 = exercisedata(
            "한국", "Han-Guk"
        )
        val exedata2 = exercisedata(
            "안녕하세요", "An-Nyeong-Ha-Se-Yo"
        )
        val exedata3 = exercisedata(
            "달콤해", "Dal-Kom-Hae"
        )
        val exedata4 = exercisedata(
            "맛있어", "Mad-Iss-eo"
        )
        val exedata5 = exercisedata(
            "피곤해요", "Pi-Gon-Hae-Yo"
        )
        val exedata6 = exercisedata(
            "좋은 오후예요", "Jo-Eun O-Hu-E-Yo"
        )
        val exedata7 = exercisedata(
            "신기하네요", "Sin-Gi-Ha-Ne-Yo"
        )
        val exedata8 = exercisedata(
            "빨리", "Ppal-Ri"
        )
        val exedata9 = exercisedata(
            "좋은 아침이에요", "Jo-Eun A-Chim-I-E-Yo"
        )
        val exedata10 = exercisedata(
            "초콜릿", "Cho-Kol-Rit"
        )

        readingexercisedata.add(exedata1)
        readingexercisedata.add(exedata2)
        readingexercisedata.add(exedata3)
        readingexercisedata.add(exedata4)
        readingexercisedata.add(exedata5)
        readingexercisedata.add(exedata6)
        readingexercisedata.add(exedata7)
        readingexercisedata.add(exedata8)
        readingexercisedata.add(exedata9)
        readingexercisedata.add(exedata10)

        val exe1 = view.findViewById<TextView>(R.id.exercise_1)
        val exe2 = view.findViewById<TextView>(R.id.exercise_2)
        val exe3 = view.findViewById<TextView>(R.id.exercise_3)
        val exe4 = view.findViewById<TextView>(R.id.exercise_4)
        val exe5 = view.findViewById<TextView>(R.id.exercise_5)
        val exe6 = view.findViewById<TextView>(R.id.exercise_6)
        val exe7 = view.findViewById<TextView>(R.id.exercise_7)
        val exe8 = view.findViewById<TextView>(R.id.exercise_8)
        val exe9 = view.findViewById<TextView>(R.id.exercise_9)
        val exe10 = view.findViewById<TextView>(R.id.exercise_10)

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

        exe1.setOnClickListener{
            val databag = exedata1
            if (status1 == true){
                exe1.text = databag.romanized
                status1 = false
            } else {
                exe1.text = databag.default
                status1 = true
            }
        }

        exe2.setOnClickListener{
            val databag = exedata2
            if (status2 == true){
                exe2.text = databag.romanized
                status2 = false
            } else {
                exe2.text = databag.default
                status2 = true
            }
        }

        exe3.setOnClickListener{
            val databag = exedata3
            if (status3 == true){
                exe3.text = databag.romanized
                status3 = false
            } else {
                exe3.text = databag.default
                status3 = true
            }
        }

        exe4.setOnClickListener{
            val databag = exedata4
            if (status4 == true){
                exe4.text = databag.romanized
                status4 = false
            } else {
                exe4.text = databag.default
                status4 = true
            }
        }

        exe5.setOnClickListener{
            val databag = exedata5
            if (status5 == true){
                exe5.text = databag.romanized
                status5 = false
            } else {
                exe5.text = databag.default
                status5 = true
            }
        }

        exe6.setOnClickListener{
            val databag = exedata6
            if (status6 == true){
                exe6.text = databag.romanized
                status6 = false
            } else {
                exe6.text = databag.default
                status6 = true
            }
        }

        exe7.setOnClickListener{
            val databag = exedata7
            if (status7 == true){
                exe7.text = databag.romanized
                status7 = false
            } else {
                exe7.text = databag.default
                status7 = true
            }
        }

        exe8.setOnClickListener{
            val databag = exedata8
            if (status8 == true){
                exe8.text = databag.romanized
                status8 = false
            } else {
                exe8.text = databag.default
                status8 = true
            }
        }

        exe9.setOnClickListener{
            val databag = exedata9
            if (status9 == true){
                exe9.text = databag.romanized
                status9 = false
            } else {
                exe9.text = databag.default
                status9 = true
            }
        }

        exe10.setOnClickListener{
            val databag = exedata10
            if (status10 == true){
                exe10.text = databag.romanized
                status10 = false
            } else {
                exe10.text = databag.default
                status10 = true
            }
        }

    }

}