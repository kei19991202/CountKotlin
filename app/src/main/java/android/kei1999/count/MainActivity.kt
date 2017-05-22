package android.kei1999.count

import android.kei1999.count.R.id.textView
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {


    var number = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var tv = findViewById(R.id.textView) as TextView
        val plus = findViewById(R.id.button) as Button
        val minus = findViewById(R.id.button2) as Button
        val multiply = findViewById(R.id.button3) as Button
        val divide = findViewById(R.id.button4) as Button

//        public void plus(View v) {  //java
//            number++;
//            tv.setText(number + "");
//        }

        //↓↓ java to kotlin

        plus.setOnClickListener {  //kotlin
            number++
            tv.text = number.toString()
        }
        minus.setOnClickListener {
            number--
            tv.text = number.toString()
        }
        multiply.setOnClickListener {
            number *= 2
            tv.text = number.toString()
        }
        divide.setOnClickListener {
            number /= 2
            tv.text = number.toString()
        }

    }

//    fun plus(v: View?) {
//        number++
//        tv.text = "${number}"
//    }
//
//    fun minus(v: View?) {
//        number--
//        tv.text = number.toString()
//    }
//
//    fun multiply(v: View?) {
//        number = number * 2
//        tv.text = number.toString() + ""
//    }
//
//    fun divide(v: View?) {
//        number = number / 2
//        textView.text = number.toString() + ""
//    }


}
