package com.tef.hellworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val titleTextView : TextView = findViewById(R.id.title_text_view)

        val name = intent.extras?.getString("nombre")
        titleTextView.text = name

        name?.let { Log.d("nombre", it)}
    }
}

// test comment