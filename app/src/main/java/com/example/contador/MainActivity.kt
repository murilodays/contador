package com.example.contador

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {

    private var counter = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView = findViewById<TextView>(R.id.textView)
        val btnIncrease = findViewById<FloatingActionButton>(R.id.floatingActionButton1)
        val btnDecrease = findViewById<FloatingActionButton>(R.id.floatingActionButton2)

        btnIncrease.setOnClickListener {
            if (counter < 100) {
                counter++
                textView.text = counter.toString()
            }
        }

        btnDecrease.setOnClickListener {
            if (counter > 0) {
                counter--
                textView.text = counter.toString()
            }
        }
    }
}