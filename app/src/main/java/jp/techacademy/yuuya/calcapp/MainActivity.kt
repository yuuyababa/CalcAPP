package jp.techacademy.yuuya.calcapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import android.content.Intent
import android.view.View
import androidx.annotation.IntegerRes
import com.google.android.material.snackbar.Snackbar


class MainActivity : AppCompatActivity(),View.OnClickListener{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Pulus.setOnClickListener(this)
        Minus.setOnClickListener(this)
        Multiplied.setOnClickListener(this)
        Divided.setOnClickListener(this)
    }

    override fun onClick(p0: View) {
        val setValue1 = value1.getText().toString()
        val setValue2 = value2.getText().toString()

        if (setValue1 != "" && setValue2 != "") {



            val calcValue1: Double = setValue1.toDouble()
            val calcValue2: Double = setValue2.toDouble()

            when (p0.id) {
                R.id.Pulus -> changePage(calcValue1, calcValue2, "Pu")
                R.id.Minus -> changePage(calcValue1, calcValue2, "Mi")
                R.id.Multiplied -> changePage(calcValue1, calcValue2, "Mu")
                R.id.Divided -> changePage(calcValue1, calcValue2, "Di")
            }
        }

        val snackbar = Snackbar.make(p0,"値を入力して下さい",Snackbar.LENGTH_SHORT)
        snackbar.show()

        return
    }


    private fun changePage( calvalue1:Double,calvalue2:Double, type:String) {
        val Result: Double


            if (type == "Pu") {
                Result = calvalue1 + calvalue2
            } else if (type == "Mi") {
                Result = calvalue1 - calvalue2
            } else if (type == "Mu") {
                Result = calvalue1 * calvalue2
            } else {
                Result = calvalue1 / calvalue2
            }

            val intent = Intent(this, result::class.java)
            intent.putExtra("Result", Result)
            startActivity(intent)
        }

}