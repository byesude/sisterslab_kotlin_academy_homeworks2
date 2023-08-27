package com.sisterslab.week6homework2


import android.content.Intent
import android.os.Bundle

import androidx.appcompat.app.AppCompatActivity


class ActivityThree : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_three)
    }

    override fun onBackPressed() {
        val yeniIntent = Intent(this@ActivityThree,MainActivity::class.java)
        yeniIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        startActivity(yeniIntent)
    }

}