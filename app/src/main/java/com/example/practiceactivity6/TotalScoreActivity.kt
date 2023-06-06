package com.example.practiceactivity6

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.practiceactivity6.databinding.ActivityQuestion10Binding
import com.example.practiceactivity6.databinding.ActivityTotalScoreBinding

class TotalScoreActivity : AppCompatActivity() {
    private lateinit var binding : ActivityTotalScoreBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTotalScoreBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val result = intent.getStringExtra("result").toString()
        val total = intent.getStringExtra("total").toString()

        binding.txtResult.text = " $result/$total"

        binding.btnTryAgain.setOnClickListener {

            val myIntent = Intent(this, MainActivity::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_NEW_TASK)
            startActivity(myIntent)
        }
    }
}