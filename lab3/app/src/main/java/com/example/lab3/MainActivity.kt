package com.example.lab3


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.graphics.Bitmap
import android.os.Environment
import android.provider.MediaStore
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_second.*
import android.widget.ImageView
import android.widget.Toast
import java.io.File
import java.io.IOException
import java.text.SimpleDateFormat

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        camera_button.setOnClickListener(){
            if (name.text.isEmpty()) {
                val text = "Your name first"
                val duration = Toast.LENGTH_SHORT
                Toast.makeText(applicationContext, text, duration).show()
            }
            else
            dispatchTakePictureIntent()

        }

    }

    val REQUEST_IMAGE_CAPTURE = 1

    private fun dispatchTakePictureIntent() {
        Intent(MediaStore.ACTION_IMAGE_CAPTURE).also { takePictureIntent ->
            takePictureIntent.resolveActivity(packageManager)?.also {
                startActivityForResult(takePictureIntent, REQUEST_IMAGE_CAPTURE)
            }
        }
    }
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == REQUEST_IMAGE_CAPTURE && resultCode == RESULT_OK) {
            val imageBitmap = data?.extras?.get("data") as Bitmap
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("image", imageBitmap)
            intent.putExtra("name", name.text.toString())
            startActivity(intent)
        }
    }
    }


