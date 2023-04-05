package com.cakedev.hanbaeuda

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class reading_register_name : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_reading_register_name, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //FIRE QUIZ MODE
        val reg_name_btn = getView()?.findViewById<Button>(R.id.register_name_btn)
        val name_signal = getView()?.findViewById<EditText>(R.id.name_input)
        reg_name_btn?.setOnClickListener {
            if (name_signal?.text.toString().isEmpty()) {
                Toast.makeText(getActivity(), "Please enter a name first!", Toast.LENGTH_SHORT)
                    .show()
            } else {
                val fire_Reading_quiz_mode = Intent(getActivity(), Reading_Quiz_Mode::class.java)
                fire_Reading_quiz_mode.putExtra(ConstantsReading.username, name_signal?.text.toString())
                startActivity(fire_Reading_quiz_mode)
                activity?.finish()
            }

        }

    }

}