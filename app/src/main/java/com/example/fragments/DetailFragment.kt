package com.example.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class DetailFragment : Fragment() {

    private lateinit var txtDetalle: TextView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view: View =  inflater.inflate(R.layout.fragment_detail, container, false)
        txtDetalle = view.findViewById(R.id.txtDetails)

        return view
    }

    fun mostrarInfo(info: String) {

        txtDetalle.text = info

    }

}