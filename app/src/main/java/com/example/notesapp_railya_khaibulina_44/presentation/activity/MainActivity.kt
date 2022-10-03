package com.example.notesapp_railya_khaibulina_44.presentation.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.notesapp_railya_khaibulina_44.R
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}