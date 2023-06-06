package com.example.practiceactivity6

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.practiceactivity6.databinding.ActivityQuestion10Binding

class QuestionActivity10 : AppCompatActivity() {
    private lateinit var binding:ActivityQuestion10Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQuestion10Binding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.txtYourAnswer.text = ""

        binding.btnNext.setOnClickListener {
            if(binding.radioAnswer1.isChecked || binding.radioAnswer2.isChecked ||
                binding.radioAnswer3.isChecked || binding.radioAnswer4.isChecked) {

                var count:Int = 0
                val total:Int = 10
                for((id, element) in answerkey){
                    if(answerkey[id] == resultkey[id]) count++
                }

                val myIntent = Intent(this, TotalScoreActivity::class.java)
                myIntent.putExtra("result",count.toString())
                myIntent.putExtra("total", total.toString())
                startActivity(myIntent)
            } else {
                Toast.makeText(applicationContext,"Please check your answer. Thank you!", Toast.LENGTH_SHORT).show()
            }
        }

        binding.btnPrevious.setOnClickListener {
            super.onBackPressed()
        }
        binding.radioGroup.setOnCheckedChangeListener { group, checkedId ->
            if(binding.radioAnswer1.isChecked) answerkey[10] = binding.radioAnswer1.text.toString()
            if(binding.radioAnswer2.isChecked) answerkey[10] = binding.radioAnswer2.text.toString()
            if(binding.radioAnswer3.isChecked) answerkey[10] = binding.radioAnswer3.text.toString()
            if(binding.radioAnswer4.isChecked) answerkey[10] = binding.radioAnswer4.text.toString()

            if(answerkey[10] == resultkey[10]) binding.txtYourAnswer.text = "You are correct!"
            else binding.txtYourAnswer.text = "The correct answer is ${resultkey[10]}"
        }

    }
}