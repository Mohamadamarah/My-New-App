package com.example.mohammad.newapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.RecyclerView
import android.widget.Button



class Page1 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page1)

        val home = findViewById<Button>(R.id.homebutton)
        val rec = findViewById<RecyclerView>(R.id.recview)

        home.setOnClickListener {
            val intent = Intent(this, Home::class.java)
            startActivity(intent)
        }
        rec.setOnClickListener {
            val intent = Intent(this, java::class.java)
            startActivity(intent)


        }


    }


}

