package com.cakedev.hanbaeuda

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.navigation.Navigation

class frag_writing : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_writing, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val topicsyllableblocks = getView()?.findViewById<Button>(R.id.syllable_blocks)
        topicsyllableblocks?.setOnClickListener{
            Navigation.findNavController(view).navigate(R.id.action_frag_writing_to_syllable_blocks_nested)
        }

        val topiclettero = getView()?.findViewById<Button>(R.id.the_letter_o)
        topiclettero?.setOnClickListener{
            Navigation.findNavController(view).navigate(R.id.action_frag_writing_to_writing_topic_letter_o)
        }

        val verticalvowels = getView()?.findViewById<Button>(R.id.vertical_vowels)
        verticalvowels?.setOnClickListener{
            Navigation.findNavController(view).navigate(R.id.action_frag_writing_to_writing_topic_vertical_vowels)
        }

        val horizontalvowels = getView()?.findViewById<Button>(R.id.horizontal_vowels)
        horizontalvowels?.setOnClickListener{
            Navigation.findNavController(view).navigate(R.id.action_frag_writing_to_writing_topic_horizontal_vowels)
        }

        val consonants = getView()?.findViewById<Button>(R.id.consonants)
        consonants?.setOnClickListener{
            Navigation.findNavController(view).navigate(R.id.action_frag_writing_to_writing_topic_consonants)
        }

        //WRITING TEST
        val writing_test = getView()?.findViewById<Button>(R.id.start_writing_test)
        writing_test?.setOnClickListener{
            Navigation.findNavController(view).navigate(R.id.action_frag_writing_to_register_name)
        }

    }

}