package com.example.fate

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var button1: Button =findViewById(R.id.btn1)
        button1.setOnClickListener()
        {
            val intent1: Intent = Intent(this@MainActivity, Activity2::class.java)
            startActivity(intent1)
        }

        var button2: Button =findViewById(R.id.btn2)
        button2.setOnClickListener()
        {
            val intent2: Intent = Intent(this@MainActivity, Activity4::class.java)
            startActivity(intent2)
        }
    }
}