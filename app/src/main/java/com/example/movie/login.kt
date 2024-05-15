package com.example.movie

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class login : AppCompatActivity() {
    lateinit var login: Button
    override fun onCreate(savedInstanceState:Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)


        login = findViewById<Button>(R.id.button)
        login.setOnClickListener{
            loginButtonFunction()
        }
    }
    fun loginButtonFunction() {
        val intent = Intent(this, homepage2::class.java)

        startActivity(intent)
    }

}

