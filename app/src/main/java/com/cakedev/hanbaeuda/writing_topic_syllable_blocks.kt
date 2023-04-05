package com.cakedev.hanbaeuda

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation

class writing_topic_syllable_blocks : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_writing_topic_syllable_blocks, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val nextlesson = getView()?.findViewById<Button>(R.id.syllable_blocks_p1nextlesson)
        nextlesson?.setOnClickListener {
            Navigation.findNavController(view)
                .navigate(R.id.action_writing_topic_syllable_blocks_to_writing_topic_syllable_blocks_2)
        }

    }

}