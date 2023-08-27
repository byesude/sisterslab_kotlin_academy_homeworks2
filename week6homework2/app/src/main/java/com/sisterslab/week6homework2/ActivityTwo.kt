package com.sisterslab.week6homework2

import android.os.Bundle
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import com.sisterslab.week6homework2.databinding.ActivityTwoBinding

class ActivityTwo : AppCompatActivity() {
    private lateinit var binding: ActivityTwoBinding
    override fun onCreate(savedInstanceState: Bundle ?){
        super.onCreate(savedInstanceState)
        binding = ActivityTwoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.activityThreeButton.setOnClickListener{
            startActivity(Intent(this@ActivityTwo,ActivityThree::class.java))
        }
    }
}