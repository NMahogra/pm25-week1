package com.example.tugas1

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun handleClick(view: View){
        val input: EditText = findViewById(R.id.inputText)
        val name: String = input.text.toString()
        val result: TextView = findViewById(R.id.tvHasil)
        result.setText("Welcome, $name to Kessoku Band")
    }
}