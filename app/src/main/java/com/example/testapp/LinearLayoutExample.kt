package com.example.testapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.testapp.databinding.LinerLayoutExampleBinding

class LinearLayoutExample: AppCompatActivity() {

    private lateinit var binding: LinerLayoutExampleBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = LinerLayoutExampleBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var lucas = 0;

        binding.button1.setOnClickListener { view ->
            if(lucas == 0){
                binding.button1.setBackgroundColor(resources.getColor(
                    androidx.cardview.R.color.cardview_dark_background
                    , null))
                lucas = 1;
                binding.button1.text = "Preto"
                binding.textView1.text = "Preto: "

            }else{
                binding.button1.setBackgroundColor(resources.getColor(
                    R.color.red
                    , null))
                lucas = 0;
                binding.button1.text = "Vermelho"
                binding.textView1.text = "Vermelho: "

            }

        }
    }
}