package com.testmap.cmake

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val ApiKey = Keys.apiKey()

        findViewById<TextView>(R.id.tvKey).text = "$ApiKey"
    }
}