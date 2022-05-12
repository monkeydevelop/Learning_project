package com.example.learning_project

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

//List2-9で追加
import android.view.View
import android.widget.TextView

import java.util.Date


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
        //List2-9で追加
        fun btnCurrentClick(v:View){
            val txtResult = findViewById<TextView>(R.id.txtReslut)
            txtResult.text = Date().toString()

        }


}