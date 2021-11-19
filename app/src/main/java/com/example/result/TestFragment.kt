package com.example.result

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

class TestFragment : Fragment() {
private lateinit var yesButton: Button
private lateinit var noButton: Button

override fun onCreateView(
    inflater: LayoutInflater, container: ViewGroup?,
    savedInstanceState: Bundle?
): View? {
    val view = inflater.inflate(R.layout.fragment_test, container, false)
    yesButton = view.findViewById(R.id.button_yes)
     noButton = view.findViewById(R.id.button_no)

    val yesFragment = YesFragment()
    yesButton.setOnClickListener {
        activity?.supportFragmentManager
            ?.beginTransaction()
            ?.replace(R.id.fragment_container, yesFragment)
            ?.commit()
    }
    val bedButton:Button=view.findViewById(R.id.button_bed)
    val link: Uri = Uri.parse("https://ya.cc/t/f382y0_Bynirs")
    val intent= Intent(Intent.ACTION_VIEW,link)
    bedButton.setOnClickListener {
        startActivity(intent)}

       val noFragment = NoFragment()
       noButton.setOnClickListener {
           activity?.supportFragmentManager
               ?.beginTransaction()
               ?.replace(R.id.fragment_container, noFragment)
              ?.commit()
      }
    return view
}


}