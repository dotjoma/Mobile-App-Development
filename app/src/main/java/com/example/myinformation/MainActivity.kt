package com.example.myinformation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    public fun closeProgram(view : View) {
        AlertDialog.Builder(this)
            .setTitle("Close Program")
            .setMessage("Are you sure you want to close application?")
            .setPositiveButton("Yes") { _, _ ->
                finish()
            }
            .setNegativeButton("No") { db, _ ->
                db.dismiss()
            }
            .show()
    }

    public  fun displayInfo(view: View) {
        Intent(this, DisplayActivity::class.java).also {
            startActivity(it)
        }
    }
}