package com.example.result

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

class YesFragment : Fragment() {

    private lateinit var no2Button: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_yes, container, false)
        no2Button = view.findViewById(R.id.button_no2)


    val noFragment = NoFragment()
    no2Button.setOnClickListener {
        activity?.supportFragmentManager
            ?.beginTransaction()
            ?.replace(R.id.fragment_container, noFragment)
            ?.commit()
    }

    return view
}


}