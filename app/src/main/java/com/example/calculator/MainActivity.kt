package com.example.calculator

import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.calculator.databinding.ActivityMainBinding
import net.objecthunter.exp4j.ExpressionBuilder


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        with(binding){
            var text: String
            var check = 0
            tvKalkulasi.text = ""
            tvResult.text = ""
            var kalkulasi = tvKalkulasi.text
            var result = tvResult.text

            val btn0 = binding.btnnol
            val btn1 = binding.btnsatu
            val btn2 = binding.btndua
            val btn3 = binding.btntiga
            val btn4 = binding.btnempat
            val btn5 = binding.btnlima
            val btn6 = binding.btnenam
            val btn7 = binding.btntujuh
            val btn8 = binding.btndelapan
            val btn9 = binding.btnsembilan
            val btnbagi = binding.btnbagi
            val btnpersen = binding.btnpersen
            val btnkali = binding.btnkali
            val btntambah = binding.btnplus
            val btnkurang = binding.btnminus
            val btnac = binding.btnac
            val btnsamadengan = btnsamadengan
            val btndot = binding.btntitik

            btn0.setOnClickListener{
                text = kalkulasi.toString()+"0"
                kalkulasi = text
                tvResult.text = kalkulasi.toString()
            }

            btn1.setOnClickListener{
                text = kalkulasi.toString()+"1"
                kalkulasi = text
                tvResult.text = kalkulasi.toString()

            }

            btn2.setOnClickListener{
                text = kalkulasi.toString()+"2"
                kalkulasi = text
                tvResult.text = kalkulasi.toString()

            }

            btn3.setOnClickListener{
                text = kalkulasi.toString()+"3"
                kalkulasi = text
                tvResult.text = kalkulasi.toString()

            }

            btn4.setOnClickListener{
                text = kalkulasi.toString()+"4"
                kalkulasi = text
                tvResult.text = kalkulasi.toString()

            }

            btn5.setOnClickListener{
                text = kalkulasi.toString()+"5"
                kalkulasi = text
                tvResult.text = kalkulasi.toString()

            }

            btn6.setOnClickListener{
                text = kalkulasi.toString()+"6"
                kalkulasi = text
                tvResult.text = kalkulasi.toString()

            }

            btn7.setOnClickListener{
                text = kalkulasi.toString()+"7"
                kalkulasi = text
                tvResult.text = kalkulasi.toString()

            }

            btn8.setOnClickListener{
                text = kalkulasi.toString()+"8"
                kalkulasi = text
                tvResult.text = kalkulasi.toString()

            }

            btn9.setOnClickListener{
                text = kalkulasi.toString()+"9"
                kalkulasi = text
                tvResult.text = kalkulasi.toString()

            }

            btntambah.setOnClickListener{
                text = kalkulasi.toString()+"+"
                kalkulasi = text
                tvResult.text = kalkulasi.toString()

            }

            btnkurang.setOnClickListener{
                text = kalkulasi.toString()+"-"
                kalkulasi = text
                tvResult.text = kalkulasi.toString()

            }

            btnbagi.setOnClickListener{
                text = kalkulasi.toString()+"/"
                kalkulasi = text
                tvResult.text = kalkulasi.toString()

            }

            btnkali.setOnClickListener{
                text = kalkulasi.toString()+"*"
                kalkulasi = text
                tvResult.text = kalkulasi.toString()

            }

            btnpersen.setOnClickListener{
                text = kalkulasi.toString()+"%"
                kalkulasi = text
                tvResult.text = kalkulasi.toString()

            }

            btnac.setOnClickListener{
                text = ""
                kalkulasi = text
                tvResult.text = kalkulasi.toString()

            }

            btndot.setOnClickListener{
                text = kalkulasi.toString()+"."
                kalkulasi = text
                tvResult.text = kalkulasi.toString()
            }
            btnsamadengan.setOnClickListener{
                val temp = tvResult.text
                val hasilFungsi = evaluateExpression(tvResult.text as String)
                tvResult.setText(hasilFungsi.toString())
                tvKalkulasi.setText(temp)
            }



        }


    }
    fun evaluateExpression(expression: String): Double {
        return try {
            val expr = ExpressionBuilder(expression).build()
            expr.evaluate()
        } catch (e: Exception) {
            e.printStackTrace()
            Double.NaN
        }
    }
    
}