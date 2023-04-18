package com.example.mobile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import android.widget.TextView

class MainActivity : AppCompatActivity(), OnClickListener {
    lateinit var txv:TextView
    var text = "請按"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        txv = findViewById(R.id.txv)
        txv.text = "請按"

    }

    fun happy(v: View){
        var txv: TextView = findViewById(R.id.txv)
        txv.text ="資管2B\n411054113"
    }
    fun sad(v: View){
        var txv: TextView = findViewById(R.id.txv)
        txv.text ="張予綸"
    }
    fun funny(v: View){
        var txv: TextView = findViewById(R.id.txv)
        txv.text ="我是轉學生來自國立台灣體育大學\n讀了一年轉來這\n個性內向不太愛主動說話\n但我樂意別人跟我聊天"
    }
    fun music(v: View){
        var txv: TextView = findViewById(R.id.txv)
        txv.text ="喜好音樂\n唱歌\nbeatbox"
    }

    override fun onClick(p0: View?) {
        var txv: TextView = findViewById(R.id.txv)
        txv.text ="12"
    }
}


