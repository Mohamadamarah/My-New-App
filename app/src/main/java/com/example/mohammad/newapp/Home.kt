package com.example.mohammad.newapp

import android.content.Intent
import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class Home : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val red = findViewById<RadioButton>(R.id.r1)
        val blue = findViewById<RadioButton>(R.id.r2)
        val buttonClick = findViewById<Button>(R.id.b1)
        val buttonClick2 = findViewById<Button>(R.id.b2)
        val buttonClick3 = findViewById<Button>(R.id.act2Button)
        val text1 = findViewById<TextView>(R.id.t1)
        val ed1 = findViewById<EditText>(R.id.edt1)
        val ed2 = findViewById<EditText>(R.id.edt2)

        buttonClick.setOnClickListener {
            val tt1 = ed1.text.toString()
            val tt2 = ed2.text.toString()
            if (tt1.isEmpty()) {
                Toast.makeText(this, "Please Input Values 1", Toast.LENGTH_LONG).show()
                return@setOnClickListener
            }
            if (tt2.isEmpty()) {
                Toast.makeText(this, "Please Input Values 2", Toast.LENGTH_LONG).show()
                return@setOnClickListener
            }
            val inputValue1 = tt1.toInt()
            val inputValue2 = tt2.toInt()


            text1.setText("This is Your Answer")
            Toast.makeText(this, "The Sum Of ${ed1.text.toString()} And ${ed2.text.toString()} is ${inputValue1 + inputValue2} :)", Toast.LENGTH_LONG).show()


        }

        buttonClick2.setOnClickListener {
            if (red.isChecked()) {
                text1.setTextColor(Color.RED)
            } else if (blue.isChecked()) {
                text1.setTextColor(Color.BLUE)
            } else if (!red.isChecked() && !blue.isChecked()) {
                text1.setTextColor(Color.GRAY)
            }
        }
        buttonClick3.setOnClickListener{
            val intent = Intent(this, Page1::class.java)
            startActivity(intent)

        }

    }




}
