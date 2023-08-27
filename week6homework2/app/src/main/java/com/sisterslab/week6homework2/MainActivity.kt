package com.sisterslab.week6homework2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.sisterslab.week6homework2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.activityTwoButton.setOnClickListener{
            val yeniIntent = Intent(this@MainActivity,ActivityTwo::class.java)
            startActivity(yeniIntent)
        }
    }
}