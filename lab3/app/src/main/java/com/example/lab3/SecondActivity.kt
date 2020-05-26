package com.example.lab3

import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val bitmap = intent.getParcelableExtra<Bitmap>("image")

        imageView.setImageBitmap(bitmap)
        photographers_name.text = intent.getStringExtra("name")
    }
}
