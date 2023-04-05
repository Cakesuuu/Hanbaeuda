package com.cakedev.hanbaeuda

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation

class writing_topic_vertical_vowels : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_writing_topic_vertical_vowels, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val tovowels = getView()?.findViewById<Button>(R.id.vertical_vowels_vl)
        tovowels?.setOnClickListener {
            Navigation.findNavController(view)
                .navigate(R.id.action_writing_topic_vertical_vowels_to_writing_topic_vowels_general)
        }
    }

}