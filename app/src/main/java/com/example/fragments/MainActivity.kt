package com.example.fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity(), DataFragment.DataListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun enviarInfo(info: String) {

        val detailsFragment: DetailFragment = supportFragmentManager.findFragmentById(R.id.detailFragment) as DetailFragment
        detailsFragment.mostrarInfo(info)

    }
}