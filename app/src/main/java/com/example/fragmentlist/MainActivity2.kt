package com.example.fragmentlist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fragmentlist.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    private lateinit var binding: ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val msg = intent.getStringExtra("title")
        val pic = intent.getIntExtra("pic",R.drawable.msdhoni)

        binding.tvText.text = msg
        binding.ivImage.setImageResource(pic)

    }
}