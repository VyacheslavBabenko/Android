package com.example.lab1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val text = "onCreate now"
        val duration = Toast.LENGTH_SHORT
        Toast.makeText(applicationContext, text, duration).show()
    }

    override fun onStart() {
        super.onStart()
        val text = "onStart now"
        val duration = Toast.LENGTH_SHORT
        Toast.makeText(applicationContext, text, duration).show()
    }

    override fun onResume() {
        super.onResume()
        val text = "onResume now"
        val duration = Toast.LENGTH_SHORT
        Toast.makeText(applicationContext, text, duration).show()
    }

    override fun onPause() {
        super.onPause()
        val text = "onPause now"
        val duration = Toast.LENGTH_SHORT
        Toast.makeText(applicationContext, text, duration).show()
    }

    override fun onStop() {
        super.onStop()
        val text = "onStop now"
        val duration = Toast.LENGTH_SHORT
        Toast.makeText(applicationContext, text, duration).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        val text = "onDestroy now"
        val duration = Toast.LENGTH_SHORT
        Toast.makeText(applicationContext, text, duration).show()
    }
}
