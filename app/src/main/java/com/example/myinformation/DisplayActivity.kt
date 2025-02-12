package com.example.myinformation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class DisplayActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display)
    }

    public fun returnPage(view: View) {
        onBackPressed()
    }
}