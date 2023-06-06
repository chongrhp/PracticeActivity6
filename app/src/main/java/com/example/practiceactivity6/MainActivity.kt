package com.example.practiceactivity6

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.practiceactivity6.databinding.ActivityMainBinding

var answerkey = mutableMapOf<Int, String>()
var resultkey = mapOf(
    1 to "10",
    2 to "49",
    3 to "633",
    4 to "3",
    5 to "7 boxes",
    6 to "40%",
    7 to "44",
    8 to "Battery is charged or it was sunny day.",
    9 to "630",
    10 to "12 units")

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btnStart.setOnClickListener {
            val myIntent = Intent(this, QuestionActivity1::class.java)
            startActivity(myIntent)
        }
    }
}

