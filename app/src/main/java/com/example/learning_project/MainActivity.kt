package com.example.learning_project

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

//List2-9で追加
import android.view.View
import android.widget.TextView

//List2-10で追加
import android.widget.Button
import org.w3c.dom.Text

import java.util.Date


class MainActivity : AppCompatActivity() {

    //リスナークラスを定義
    private inner class MyListener : View.OnClickListener{
        override fun onClick(v: View?) {
            val txtResult = findViewById<TextView>(R.id.txtReslut)
            txtResult.text = Date().toString()
        }
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //リスナークラスの練習
        val btnCurrent = findViewById<Button>(R.id.btnCurrent)
        //リスナーオブジェクトを登録
//        btnCurrent.setOnClickListener(MyListener())
        //List2-11(HelloEventListener)
        btnCurrent.setOnClickListener { v: View ->
            val txtResult = findViewById<TextView>(R.id.txtReslut)
            txtResult.text = Date().toString()
        }




        //List2-10(HelloEventListener
//        val btnCurrent = findViewById<Button>(R.id.btnCurrent)
//        btnCurrent.setOnClickListener(
//            object:View.OnClickListener{
//                override fun onClick(v: View?) {
//                    val txtResult = findViewById<TextView>(R.id.txtReslut)
//                    txtResult.text = Date().toString()
//                }
//            }
//        )

    }
        //List2-9（HelloEvent）で追加
//        fun btnCurrentClick(v:View){
//            val txtResult = findViewById<TextView>(R.id.txtReslut)
//            txtResult.text = Date().toString()
//
//        }


}