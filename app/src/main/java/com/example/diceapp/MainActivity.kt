package com.example.diceapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
     val rollButton : Button = findViewById(R.id.button)
        rollButton.setOnClickListener {
            roll()

        }
    }
   private fun roll() {
       val diceOne = Dice(6)
       val diceTwo = Dice(6)
       val diceThree = Dice(6)
       val rollDiceResult1 = diceOne.rollDice()
       val rollDiceResult2 = diceTwo.rollDice()
       val rollDiceResult3 = diceThree.rollDice()
       val diceImage0: ImageView = findViewById(R.id.image1)
       val diceImage1: ImageView = findViewById(R.id.image2)
       val diceImage3: ImageView = findViewById(R.id.image3)
       val toast0 = Toast.makeText(this, "you win", Toast.LENGTH_SHORT)
       val toast1 = Toast.makeText(this,"you lose", Toast.LENGTH_SHORT)
       when (rollDiceResult1) {
           1 -> println(diceImage0.setImageResource(R.drawable.dice1))
           2 -> println(diceImage0.setImageResource(R.drawable.dice2))
           3 -> println(diceImage0.setImageResource(R.drawable.dice3))
           4 -> println(diceImage0.setImageResource(R.drawable.dice4))
           5 -> println(diceImage0.setImageResource(R.drawable.dice5))
           6 -> println(diceImage0.setImageResource(R.drawable.dice6))

       }
       when (rollDiceResult2) {
           1 -> println(diceImage1.setImageResource(R.drawable.dice1))
           2 -> println(diceImage1.setImageResource(R.drawable.dice2))
           3 -> println(diceImage1.setImageResource(R.drawable.dice3))
           4 -> println(diceImage1.setImageResource(R.drawable.dice4))
           5 -> println(diceImage1.setImageResource(R.drawable.dice5))
           6 -> println(diceImage1.setImageResource(R.drawable.dice6))
       }

       when (rollDiceResult3) {
           1 -> println(diceImage3.setImageResource(R.drawable.dice1))
           2 -> println(diceImage3.setImageResource(R.drawable.dice2))
           3 -> println(diceImage3.setImageResource(R.drawable.dice3))
           4 -> println(diceImage3.setImageResource(R.drawable.dice4))
           5 -> println(diceImage3.setImageResource(R.drawable.dice5))
           6 -> println(diceImage3.setImageResource(R.drawable.dice6))
       }
       if   (rollDiceResult1 == 6 && rollDiceResult2 == 6 || rollDiceResult1 == 6 && rollDiceResult3 == 6) {
           toast0.show()

       }else if (rollDiceResult2 == 6 && rollDiceResult1 == 6 || rollDiceResult2 == 6 && rollDiceResult3 == 6) {
           toast0.show()

       }else if (rollDiceResult3 == 6 && rollDiceResult1 == 6 || rollDiceResult3 == 6 && rollDiceResult2 == 6) {
           toast0.show()
       }
       if (rollDiceResult1 + rollDiceResult2 ==9 || rollDiceResult1 + rollDiceResult3 ==9) {
           toast1.show()
       }else if (rollDiceResult3 + rollDiceResult1 ==9 || rollDiceResult2 + rollDiceResult3 == 9) {
           toast1.show()
       }else if (rollDiceResult3 + rollDiceResult1 == 9 || rollDiceResult3 + rollDiceResult2 ==9) {
           toast1.show()
       }
   }

}
class Dice( private var sides : Int) {
    fun rollDice(): Int {
        return (1..sides).random()
    }
}

