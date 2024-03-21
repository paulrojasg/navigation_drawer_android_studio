package com.example.class5_homework

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.class5_homework.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }


}