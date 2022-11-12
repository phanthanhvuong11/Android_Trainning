package com.example.projectlearnandroid

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //show activity music delay 1s
        Handler().postDelayed({
            val myIntent = Intent(this, MusicActivity::class.java)
         //   myIntent.putExtra("key", value) //Optional parameters
            startActivity(myIntent)
        }, 2000L)
    }
}
