package com.example.marcrosnaptasks

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val tasks = Tasks(applicationContext)

        val msg1 = "1 sec timer"
        val secs = 1

        val msg2 = "5:00 am alarm"
        val hour = 5
        val min = 0

        val geo = Uri.parse("geo:47.6,-122.3")
        val url = Uri.parse("https://piezosaurus.github.io/")

        val task1: Button = findViewById(R.id.button1)
        task1.setOnClickListener {
            tasks.timer(msg1, secs)
        }

        val task2: Button = findViewById(R.id.button2)
        task2.setOnClickListener {
            tasks.alarm(msg2, hour, min)
        }

        val task3: Button = findViewById(R.id.button3)
        task3.setOnClickListener {
            tasks.spotify(url)
        }

    }
}