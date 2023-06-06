package com.example.practiceactivity6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.practiceactivity6.databinding.ActivityQuestion12Binding

class QuestionActivity12 : AppCompatActivity() {
    private lateinit var binding :ActivityQuestion12Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQuestion12Binding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}