package com.cakedev.hanbaeuda

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.navigation.Navigation

class frag_reading : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_reading, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val topicreadingorder = getView()?.findViewById<Button>(R.id.reading_order)
        topicreadingorder?.setOnClickListener {
            Navigation.findNavController(view)
                .navigate(R.id.action_frag_reading_to_reading_topic_reading_order)
        }

        val topicbatchim = getView()?.findViewById<Button>(R.id.batchim_button)
        topicbatchim?.setOnClickListener {
            Navigation.findNavController(view)
                .navigate(R.id.action_frag_reading_to_reading_topic_batchim)
        }

        val topicreadingexercises = getView()?.findViewById<Button>(R.id.reading_exercise_1)
        topicreadingexercises?.setOnClickListener {
            Navigation.findNavController(view)
                .navigate(R.id.action_frag_reading_to_reading_topic_reading_exercises)
        }

        //READING TEST
        val writing_test = getView()?.findViewById<Button>(R.id.start_reading_test)
        writing_test?.setOnClickListener{
            Navigation.findNavController(view).navigate(R.id.action_frag_reading_to_reading_register_name)
        }

    }

}