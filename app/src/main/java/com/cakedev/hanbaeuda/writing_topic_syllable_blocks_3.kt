package com.cakedev.hanbaeuda

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation

class writing_topic_syllable_blocks_3 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_writing_topic_syllable_blocks_3, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val nextlesson3 = getView()?.findViewById<Button>(R.id.syllable_blocks_p3nextlesson)
        nextlesson3?.setOnClickListener {
            Navigation.findNavController(view)
                .navigate(R.id.action_writing_topic_syllable_blocks_3_to_writing_topic_syllable_blocks_4)
        }

        val prevlesson3 = getView()?.findViewById<Button>(R.id.syllable_blocks_p3prevlesson)
        prevlesson3?.setOnClickListener {
            Navigation.findNavController(view)
                .navigate(R.id.action_writing_topic_syllable_blocks_3_to_writing_topic_syllable_blocks_2)
        }

        val tostart = getView()?.findViewById<Button>(R.id.syllable_blocks_p3back)
        tostart?.setOnClickListener {
            Navigation.findNavController(view)
                .navigate(R.id.action_writing_topic_syllable_blocks_3_to_writing_topic_syllable_blocks)
        }

    }

}