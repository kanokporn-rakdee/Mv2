package com.example.student.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var checkdot:Int = 0
        var number1:Double = 0.0
        var number2:Double = 0.0
        var opertor:String = ""
        var check:Boolean = false

        dot.setOnClickListener {
            var test = ans.text.toString()
            checkdot = test.indexOf('.')
            if (checkdot >= 1) {

            } else {
                //test=test+"."
                ans.setText(ans.text.toString() + ".")
            }
        }
        clears.setOnClickListener{
            ans.setText("0")
            checkdot = 0
            number1 = 0.0
            number2 = 0.0
        }

        one.setOnClickListener{
            if (ans.text.toString()=="0"){
                ans.setText("1")
            } else {
                ans.setText(ans.text.toString()+"1")
            }
        }
        two.setOnClickListener{
            if (ans.text.toString()=="0"){
                ans.setText("2")
            } else {
                ans.setText(ans.text.toString()+"2")
            }
        }
        three.setOnClickListener{
            if (ans.text.toString()=="0"){
                ans.setText("3")
            } else {
                ans.setText(ans.text.toString()+"3")
            }
        }
        four.setOnClickListener{
            if (ans.text.toString()=="0"){
                ans.setText("4")
            } else {
                ans.setText(ans.text.toString()+"4")
            }
        }
        five.setOnClickListener{
            if (ans.text.toString()=="0"){
                ans.setText("5")
            } else {
                ans.setText(ans.text.toString()+"5")
            }
        }
        six.setOnClickListener{
            if (ans.text.toString()=="0"){
                ans.setText("6")
            } else {
                ans.setText(ans.text.toString()+"6")
            }
        }
        seven.setOnClickListener{
            if (ans.text.toString()=="0"){
                ans.setText("7")
            } else {
                ans.setText(ans.text.toString()+"7")
            }
        }
        eight.setOnClickListener{
            if (ans.text.toString()=="0"){
                ans.setText("8")
            } else {
                ans.setText(ans.text.toString()+"8")
            }
        }
        nine.setOnClickListener{
            if (ans.text.toString()=="0"){
                ans.setText("9")
            } else {
                ans.setText(ans.text.toString()+"9")
            }
        }
        zero.setOnClickListener{
            if (opertor == "n") {
                if (ans.text.toString()=="0"){
                    ans.setText("0")
                } else {
                    ans.setText(ans.text.toString()+"0")
                }
            } else {
                if(check == true){
                    ans.setText("0")
                    check = false
                }
                else if (ans.text.toString()=="0"){
                    ans.setText("0")
                } else {
                    ans.setText(ans.text.toString()+"0")
                }
            }
        }
        plus.setOnClickListener{
            opertor = "+"
            check = true
            var res = ans.text.toString()
            number2 = res.toDouble()
            number1 = number1 + number2
            ans.setText(number1.toString())
        }
    }
}
