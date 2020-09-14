package jp.techacademy.yuuya.calcapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import android.content.Intent
import android.view.View
import androidx.annotation.IntegerRes

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
        val calValue1 = Integer.parseInt(value1.getText().toString())
        val calValue2 = Integer.parseInt(value2.getText().toString())

    when(p0.id){
        R.id.Pulus      ->changePage()
        R.id.Minus      ->changePage()
        R.id.Multiplied ->changePage()
        R.id.Divided    ->changePage()
                }
    }


    private fun changePage( ) {
        val intent = Intent(this, result::class.java)
        startActivity(intent)
    }
}