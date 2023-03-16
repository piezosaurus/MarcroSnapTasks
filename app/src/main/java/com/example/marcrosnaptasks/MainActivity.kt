package com.example.marcrosnaptasks

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.util.Log
import android.widget.Button
import androidx.activity.result.contract.ActivityResultContracts
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val graph: GraphView = findViewById(R.id.graph)
        graph.setData(generateRandomDataPoints())

        val tasks = Tasks(this@MainActivity, applicationContext)

        val msg1 = "1 sec timer"
        val secs = 1

        val msg2 = "5:00 am alarm"
        val hour = 5
        val min = 0

        val geo = Uri.parse("geo:47.6,-122.3")
        val url = "sadfao/"
        val phoneNum = "2895521240"

        val task1: Button = findViewById(R.id.button1)
        task1.setOnClickListener {
//            tasks.timer(msg1, secs)
//            val requestPermissionLauncher =
//                registerForActivityResult(
//                    ActivityResultContracts.RequestPermission()
//                ) { isGranted: Boolean ->
//                    if (isGranted) {
//                        tasks.callPhoneNumber(phoneNum)
//                    } else {
//                        Log.i("PRINT", "permission not granted")
//                    }
//                }
            tasks.callPhoneNumber(phoneNum)
        }


        val task2: Button = findViewById(R.id.button2)
        task2.setOnClickListener {
//            tasks.alarm(msg2, hour, min)
            tasks.website(url)
        }

        val task3: Button = findViewById(R.id.button3)
        task3.setOnClickListener {
            graph.setData(generateRandomDataPoints())
//            tasks.spotify()
//            val takePictureIntent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
//            startActivityForResult(takePictureIntent, 1337)
        }
    }
    private fun generateRandomDataPoints(): List<DataPoint> {
        val random = Random()
        return (0..20).map {
            DataPoint(it, random.nextInt(50) + 1)
        }
    }
}
















