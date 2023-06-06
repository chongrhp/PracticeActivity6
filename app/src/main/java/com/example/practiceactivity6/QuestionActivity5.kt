package com.example.practiceactivity6

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.practiceactivity6.databinding.ActivityQuestion5Binding

class QuestionActivity5 : AppCompatActivity() {
    private lateinit var binding : ActivityQuestion5Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQuestion5Binding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.txtYourAnswer.text = ""

        binding.btnNext.setOnClickListener {
            val myIntent = Intent(this, QuestionActivity6::class.java)
            startActivity(myIntent)
        }

        binding.btnPrevious.setOnClickListener {
            super.onBackPressed()
        }

        binding.radioGroup.setOnCheckedChangeListener { group, checkedId ->
            if(binding.radioAnswer1.isChecked) answerkey[5] = binding.radioAnswer1.text.toString()
            if(binding.radioAnswer2.isChecked) answerkey[5] = binding.radioAnswer2.text.toString()
            if(binding.radioAnswer3.isChecked) answerkey[5] = binding.radioAnswer3.text.toString()
            if(binding.radioAnswer4.isChecked) answerkey[5] = binding.radioAnswer4.text.toString()

            if(answerkey[5] == resultkey[5]) binding.txtYourAnswer.text = "You are correct!"
            else binding.txtYourAnswer.text = "The correct answer is ${resultkey[5]}"        }
    }
}