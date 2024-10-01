package com.example.testapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.testapp.databinding.FrameLayoutExampleBinding

class FrameLayoutExample: AppCompatActivity() {

    private lateinit var binding: FrameLayoutExampleBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = FrameLayoutExampleBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}