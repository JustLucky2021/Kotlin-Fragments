package com.example.fragments_in_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MainActivity : AppCompatActivity() {

    companion object{
        val TAG = "Fragments_Kotlin"

    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnMakeNewFragment = findViewById<Button>(R.id.btnMakeFragment)
        btnMakeNewFragment.setOnClickListener{
            supportFragmentManager
                .beginTransaction()
                .add(R.id.clRoot, BlankFragment())
                .commit()
            Log.d(TAG, "${supportFragmentManager.fragments.size}")
        }

    }
}