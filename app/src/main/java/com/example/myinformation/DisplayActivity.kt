package com.example.myinformation

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import org.w3c.dom.Text

class DisplayActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display)

        val fname = intent.getStringExtra("first_name")
        val lname = intent.getStringExtra("last_name")
        val age = intent.getStringExtra("age")

        findViewById<TextView>(R.id.tvFname).apply {
            text = "First Name: $fname"
        }

        findViewById<TextView>(R.id.tvLname).apply {
            text = "Last Name: $lname"
        }

        findViewById<TextView>(R.id.tvAge).apply {
            text = "Age: $age"
        }

//        tvFname.text = fname
//        tvLname.text = lname
//        tvAge.text = age
    }

    public fun returnPage(view: View) {
        onBackPressed()
    }

}