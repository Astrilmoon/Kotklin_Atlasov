package com.example.kotklin_atlasov

import android.annotation.SuppressLint
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {
    private var text: String = "В магазине <осталось> 10 банок колы, а <может> и больше"
    private var tvText: TextView? = null

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tvText = findViewById(R.id.tvTextView)
        var subText: String = text.substringAfter('<')
        var subText2: String = subText.substringBefore('>')
        var subText3: String = text.substringAfter('<')
        var subText4: String = subText3.substringBefore('>')

        //отобразить содержимое переменной tvText на компоненте tvTextView
        tvText?.setText(subText2)
        tvText?.setText(subText4)

    }



}