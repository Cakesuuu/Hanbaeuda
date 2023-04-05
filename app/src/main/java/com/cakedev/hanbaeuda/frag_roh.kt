package com.cakedev.hanbaeuda

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation

class frag_roh : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_roh, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val topicsyllableblocks = getView()?.findViewById<Button>(R.id.syllable_blocks)
        topicsyllableblocks?.setOnClickListener{
            Navigation.findNavController(view).navigate(R.id.action_frag_roh_to_syllable_blocks_nested)
        }

        val topiclettero = getView()?.findViewById<Button>(R.id.the_letter_o)
        topiclettero?.setOnClickListener{
            Navigation.findNavController(view).navigate(R.id.action_frag_roh_to_writing_topic_letter_o2)
        }

        val topicreadingorderroh = getView()?.findViewById<Button>(R.id.reading_order)
        topicreadingorderroh?.setOnClickListener {
            Navigation.findNavController(view)
                .navigate(R.id.action_frag_roh_to_reading_topic_reading_order2)
        }

        val topicbatchimroh = getView()?.findViewById<Button>(R.id.batchim_button)
        topicbatchimroh?.setOnClickListener {
            Navigation.findNavController(view)
                .navigate(R.id.action_frag_roh_to_reading_topic_batchim2)
        }

        val topicvowelsroh = getView()?.findViewById<Button>(R.id.vowels_general_button)
        topicvowelsroh?.setOnClickListener {
            Navigation.findNavController(view)
                .navigate(R.id.action_frag_roh_to_writing_topic_vowels_general2)
        }

    }

}