package com.example.mindsharpener

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.mindsharpener.databinding.ActivityMainBinding
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //binding.checkButton.setOnClickListener{checkAnswer()}
    }

    fun randomGenerator(){
        val selectedId = binding.level.checkedRadioButtonId
        val firstDigit = when(selectedId) {
            R.id.level_easy -> Random.nextInt(0,9)
            R.id.level_medium -> Random.nextInt(10,99)
            else -> Random.nextInt(100,999)
        }

        val secondDigit = when(selectedId) {
            R.id.level_easy -> Random.nextInt(0,9)
            R.id.level_medium -> Random.nextInt(10,99)
            else -> Random.nextInt(100,999)
        }



        binding.firstNum.text = getString(firstDigit)
        binding.secondNum.text = getString(secondDigit)

        val operatorId = Random.nextInt(0,4)

        val operator = when(operatorId) {
            0 -> "+"
            1 -> "-"
            2 -> "*"
            else -> "/"
        }

        binding.operator.text = operator
        binding.firstNum.text = firstDigit.toString()
        binding.secondNum.text = secondDigit.toString()




        }
    }
