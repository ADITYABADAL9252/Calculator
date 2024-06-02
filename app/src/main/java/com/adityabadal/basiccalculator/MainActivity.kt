package com.adityabadal.basiccalculator

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val btn0=findViewById<Button>(R.id.btn0)
        val btn1=findViewById<Button>(R.id.btn1)
        val btn2=findViewById<Button>(R.id.btn2)
        val btn3=findViewById<Button>(R.id.btn3)
        val btn4=findViewById<Button>(R.id.btn4)
        val btn5=findViewById<Button>(R.id.btn5)
        val btn6=findViewById<Button>(R.id.btn6)
        val btn7=findViewById<Button>(R.id.btn7)
        val btn8=findViewById<Button>(R.id.btn8)
        val btn9=findViewById<Button>(R.id.btn9)
        val btnbra1=findViewById<Button>(R.id.btnbra1)
        val btnbra2=findViewById<Button>(R.id.btnbra2)
        val btnplus=findViewById<Button>(R.id.btnplus)
        val btnsub=findViewById<Button>(R.id.btnsub)
        val btnmul=findViewById<Button>(R.id.btnmul)
        val btndiv=findViewById<Button>(R.id.btndiv)
        val btndot=findViewById<Button>(R.id.btndot)
        val btnac=findViewById<Button>(R.id.btnac)
        val btnequal=findViewById<Button>(R.id.btnequal)
        val inputText=findViewById<TextView>(R.id.inputText)
        val outputText=findViewById<TextView>(R.id.outputText)

        btn0.setOnClickListener { inputText.append("0") }
        btn1.setOnClickListener { inputText.append("1") }
        btn2.setOnClickListener { inputText.append("2") }
        btn3.setOnClickListener { inputText.append("3") }
        btn4.setOnClickListener { inputText.append("4") }
        btn5.setOnClickListener { inputText.append("5") }
        btn6.setOnClickListener { inputText.append("6") }
        btn7.setOnClickListener { inputText.append("7") }
        btn8.setOnClickListener { inputText.append("8") }
        btn9.setOnClickListener { inputText.append("9") }
        btnbra1.setOnClickListener { inputText.append("(") }
        btnbra2.setOnClickListener { inputText.append(")") }
        btndot.setOnClickListener { inputText.append(".") }
        btnplus.setOnClickListener { inputText.append("+") }
        btnsub.setOnClickListener { inputText.append("-") }
        btnmul.setOnClickListener { inputText.append("*") }
        btndiv.setOnClickListener { inputText.append("/") }
        btnac.setOnClickListener {
            inputText.text=""
            outputText.text=""
        }
        findViewById<Button>(R.id.invisible).setOnClickListener {
            Toast.makeText(this,"this is toast",Toast.LENGTH_LONG).show()
        }
    }
}