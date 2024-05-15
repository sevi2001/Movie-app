package com.example.movie

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class homepage2 : AppCompatActivity() {

    lateinit var HARRYPOTTER: Button
        override fun onCreate(savedInstanceState:Bundle?){
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_homepage2)


            HARRYPOTTER = findViewById<Button>(R.id.button3)
            HARRYPOTTER.setOnClickListener{
                homepage2ButtonFunction()
            }
        }
        fun homepage2ButtonFunction() {
            val intent = Intent(this, fina::class.java)

            startActivity(intent)
        }

    }
