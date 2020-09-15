package jp.techacademy.yuuya.calcapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_result.*

class result : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val viewResult : Double = intent.getDoubleExtra("Result", 0.0)

        result.text = "${viewResult}"
    }
}