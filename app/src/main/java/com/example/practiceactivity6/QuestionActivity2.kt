package com.example.practiceactivity6

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.practiceactivity6.databinding.ActivityQuestion2Binding

class QuestionActivity2 : AppCompatActivity() {
    private lateinit var binding:ActivityQuestion2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQuestion2Binding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.txtYourAnswer.text = ""

        binding.btnNext.setOnClickListener {
            if(binding.radioAnswer1.isChecked || binding.radioAnswer2.isChecked ||
                binding.radioAnswer3.isChecked || binding.radioAnswer4.isChecked) {

                val myIntent = Intent(this, QuestionActivity3::class.java)
                startActivity(myIntent)
            } else {
                Toast.makeText(applicationContext,"Please check your answer. Thank you!",Toast.LENGTH_SHORT).show()
            }        }

        binding.btnPrevious.setOnClickListener {
            super.onBackPressed()
        }

        binding.radioGroup.setOnCheckedChangeListener { group, checkedId ->
            if(binding.radioAnswer1.isChecked) answerkey[2] = binding.radioAnswer1.text.toString()
            if(binding.radioAnswer2.isChecked) answerkey[2] = binding.radioAnswer2.text.toString()
            if(binding.radioAnswer3.isChecked) answerkey[2] = binding.radioAnswer3.text.toString()
            if(binding.radioAnswer4.isChecked) answerkey[2] = binding.radioAnswer4.text.toString()

            if(answerkey[2] == resultkey[2]) binding.txtYourAnswer.text = "You are correct!"
            else binding.txtYourAnswer.text = "The correct answer is ${resultkey[2]}"
        }

    }
}