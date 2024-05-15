package com.example.movie

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    lateinit var getstart: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        getstart = findViewById<Button>(R.id.button2)
        getstart.setOnClickListener {
            GetStartButtonFunction()
        }
    }

    fun GetStartButtonFunction() {
        val intent = Intent(this, login::class.java)

        startActivity(intent)
    }
}