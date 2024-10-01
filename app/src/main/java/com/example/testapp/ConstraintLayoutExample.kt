package com.example.testapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.testapp.databinding.ConstraintLayoutExampleBinding

class ConstraintLayoutExample: AppCompatActivity() {

    private lateinit var binding: ConstraintLayoutExampleBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ConstraintLayoutExampleBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button1.setOnClickListener { view ->

            binding.textView1.text = "meu pau na tua mão"

        }
    }
}