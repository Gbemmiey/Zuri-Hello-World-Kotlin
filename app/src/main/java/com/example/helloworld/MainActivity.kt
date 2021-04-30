package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var txtBtn: Button
    private lateinit var txtVw: TextView

    var displayText: Int = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        txtVw = findViewById(R.id.textView)
        txtVw.text=1.toString()
        txtBtn = findViewById(R.id.incrBtn)
        txtBtn.setOnClickListener(){increment()}
    }

    private fun increment() {
        displayText += 1
        txtVw.text = displayText.toString()
    }

}