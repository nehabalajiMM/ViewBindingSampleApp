package com.example.viewbindingsampleapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.viewbindingsampleapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
