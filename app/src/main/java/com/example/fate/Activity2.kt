package com.example.fate

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class Activity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)

        whenTheCoinIsTapped()
    }

    private fun whenTheCoinIsTapped() {
        var coin: ImageView = findViewById(R.id.iv_coin)
        coin.setOnClickListener() {
            val randomNumber = (0..1).random()
            if (randomNumber == 0) {
                flipTheCoin(R.drawable.ic_head,"Heads!")
            } else {
                flipTheCoin(R.drawable.ic_tail, "Tails!")
            }
        }
    }

    private fun flipTheCoin(imageId: Int,coinSide:String) {
        var coin: ImageView = findViewById(R.id.iv_coin)
        coin.animate().apply {
            duration = 1000
            rotationXBy(900f)
            translationYBy(-200f)
            coin.isClickable = false
        }.withEndAction {
            coin.animate().apply {
                duration = 1000
                rotationXBy(900f)
                translationYBy(200f)
                coin.isClickable = false
            }.withEndAction {
                coin.setImageResource(imageId)
                coin.isClickable = true
                Toast.makeText(this, coinSide, Toast.LENGTH_SHORT).show()
            }.start()
        }
    }
}