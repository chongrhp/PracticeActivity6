package com.example.practiceactivity6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.practiceactivity6.databinding.ActivityQuestion11Binding

class QuestionActivity11 : AppCompatActivity() {
    private lateinit var binding : ActivityQuestion11Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQuestion11Binding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}