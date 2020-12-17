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
                },
                13, 0, true)

                if (2:00 <= 9:59) {
            　　　　 textView.text = "おはよう"
                } else if (10:00 <= 17:59) {
            　　　　 textView.text = "こんにちは"
                } else (18:00 <= 1:59){
            　　　　 textView.text = "こんばんは"
                }
                timePickerDialog.show()
    }
}