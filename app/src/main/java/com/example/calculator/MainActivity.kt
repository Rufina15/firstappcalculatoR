package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnAdd.setOnClickListener {
            if (edtNo1.text.toString()!="" && edtNo2.text.toString()!=""){

                val no1 = edtNo1.text.toString().toInt()
                val no2 = edtNo2.text.toString().toInt()

                val sum = no1+no2

                Toast.makeText(this, "The sum is $sum",Toast.LENGTH_LONG).show();

            }else{
                Toast.makeText(this, "Please Fill all the Required Blanks.",Toast.LENGTH_LONG).show();
            }
        }
        btnSub.setOnClickListener {
            if (edtNo1.text.toString()!="" && edtNo2.text.toString()!=""){

                val no1 = edtNo1.text.toString().toInt()
                val no2 = edtNo2.text.toString().toInt()

                var sub : Int
                sub = if (no1>no2){
                    no1-no2
                } else{
                    no2-no1
                }

                Toast.makeText(this, "The Diffrenc is $sub",Toast.LENGTH_LONG).show();

            }else{
                Toast.makeText(this, "Please Fill all the Required Blanks.",Toast.LENGTH_LONG).show();
            }
        }

        btnMul.setOnClickListener {
            if (edtNo1.text.toString()!="" && edtNo2.text.toString()!=""){

                val no1 = edtNo1.text.toString().toInt()
                val no2 = edtNo2.text.toString().toInt()

                val mul = no1*no2

                Toast.makeText(this, "The Product is $mul",Toast.LENGTH_LONG).show();

            }else{
                Toast.makeText(this, "Please Fill all the Required Blanks.",Toast.LENGTH_LONG).show();
            }
        }

        btnDiv.setOnClickListener {
            if (edtNo1.text.toString()!="" && edtNo2.text.toString()!=""){

                val no1 = edtNo1.text.toString().toInt()
                val no2 = edtNo2.text.toString().toInt()

                var div : Float
                if (no2==0){
                    Toast.makeText(this, "A number can't be divided by zero as produces infinte solutions",Toast.LENGTH_LONG).show();
                }else {
                    div = (no1.toFloat() / no2)
                    Toast.makeText(this, "The Division is $div",Toast.LENGTH_LONG).show();
                }

            }else{
                Toast.makeText(this, "Please Fill all the Required Blanks.",Toast.LENGTH_LONG).show();
            }
        }
    }
}