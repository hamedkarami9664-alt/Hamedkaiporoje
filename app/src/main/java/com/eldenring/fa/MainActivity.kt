package com.eldenring.fa

import android.app.Activity
import android.os.Bundle
import android.widget.TextView
import android.graphics.Color
import android.view.Gravity

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        try {
            val textView = TextView(this)
            textView.text = "Elden Ring Guide\n\nApp is working!"
            textView.textSize = 24f
            textView.setTextColor(Color.WHITE)
            textView.gravity = Gravity.CENTER
            textView.setBackgroundColor(Color.DKGRAY)

            setContentView(textView)

        } catch (e: Exception) {
            val errorView = TextView(this)
            errorView.text = e.toString()
            errorView.textSize = 16f
            errorView.setTextColor(Color.RED)
            setContentView(errorView)
        }
    }
}
