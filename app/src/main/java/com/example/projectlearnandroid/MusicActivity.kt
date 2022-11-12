package com.example.projectlearnandroid

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_music.*

class MusicActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_music)

        lg.setOnClickListener {
            val intent = Intent(this, MusicDetailActivity::class.java)
            startActivity(intent)
        }
    }
}
