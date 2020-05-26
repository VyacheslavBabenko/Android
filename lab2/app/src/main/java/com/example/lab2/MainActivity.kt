package com.example.lab2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button_sum.setOnClickListener() {

            val num1: Int = Integer.parseInt(plain_text_input.text.toString())
            val num2: Int = Integer.parseInt(plain_text_input2.text.toString())
            val sum = num1 + num2
            textView.text =  sum.toString()
            Snackbar.make(it,"$num1 + $num2 =",Snackbar.LENGTH_LONG).show()
        }

        button_minus.setOnClickListener() {
            val num1: Int = Integer.parseInt(plain_text_input.text.toString())
            val num2: Int = Integer.parseInt(plain_text_input2.text.toString())
            val sum = num1 - num2
            textView.text =  sum.toString()
            Snackbar.make(it,"$num1 - $num2 =",Snackbar.LENGTH_LONG).show()
        }

        button_multiply.setOnClickListener() {
            val num1: Int = Integer.parseInt(plain_text_input.text.toString())
            val num2: Int = Integer.parseInt(plain_text_input2.text.toString())
            textView.text =  "${num1 * num2}"
            Snackbar.make(it,"$num1 * $num2 =",Snackbar.LENGTH_LONG).show()
        }

        button_division.setOnClickListener() {
            val num1: Int = Integer.parseInt(plain_text_input.text.toString())
            val num2: Int = Integer.parseInt(plain_text_input2.text.toString())
            if(num2 == 0)
                textView.text = "infinity"
            else
                textView.text = String.format("%.5f", num1/num2.toDouble())
            Snackbar.make(it,"$num1 / $num2 =",Snackbar.LENGTH_LONG).show()
        }
    }
}
