package com.example.fate

import android.animation.Animator
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.airbnb.lottie.LottieAnimationView

class Activity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_4)

        var num: TextView = findViewById(R.id.numberOnTheDie)
        num.visibility = View.GONE
        func()
    }
    private fun func() {

            var btn: Button = findViewById(R.id.btn3)
            var num: TextView = findViewById(R.id.numberOnTheDie)
            var anim: LottieAnimationView = findViewById(R.id.diceRoll)

            btn.setOnClickListener() {
                btn.isEnabled=false
                num.visibility = View.GONE
                anim.visibility = View.VISIBLE
                anim.playAnimation()
            }

            anim.addAnimatorListener(object : Animator.AnimatorListener {
                override fun onAnimationStart(animation: Animator?) {

                }

                override fun onAnimationEnd(animation: Animator?) {
                    displayingNumber()
                }

                override fun onAnimationCancel(animation: Animator?) {
                    
                }

                override fun onAnimationRepeat(animation: Animator?) {

                }
            })
    }

    private fun displayingNumber() {
        var btn:Button=findViewById(R.id.btn3)
        var num:TextView=findViewById(R.id.numberOnTheDie)
        var anim:LottieAnimationView=findViewById(R.id.diceRoll)
        var rand = (1..6).random()
        num.text = rand.toString()

        btn.isEnabled=true
        anim.visibility=View.GONE
        num.visibility=View.VISIBLE
        func()
    }
}