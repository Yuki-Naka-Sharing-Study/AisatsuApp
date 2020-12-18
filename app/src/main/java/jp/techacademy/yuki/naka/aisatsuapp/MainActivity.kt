package jp.techacademy.yuki.naka.aisatsuapp

import android.app.TimePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.button1 -> showTimePickerDialog()
        }
    }

    fun showTimePickerDialog() {
        val timePickerDialog = TimePickerDialog(
                this,
                TimePickerDialog.OnTimeSetListener { view, hour, minute ->
                    Log.d("UI_PARTS", "$hour:$minute")
                    var hour = 13
                    var minute = 0
                    if (hour >= 2 && hour <= 9 && minute <= 59) {
                        　　　　 textView.text = "おはよう"
                    } else if (hour >= 10 && hour <= 17 && minute <= 59) {
                        　　　　 textView.text = "こんにちは"
                    } else {
                        　　　　 textView.text = "こんばんは"
                    }
                },
                13, 0, true)
                timePickerDialog.show()
    }
}