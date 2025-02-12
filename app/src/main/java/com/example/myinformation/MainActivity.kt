package com.example.myinformation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    private lateinit var etFname : EditText
    private  lateinit var etLname : EditText
    private lateinit var etAge : EditText

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
        etFname = findViewById(R.id.etFname)
        etLname = findViewById(R.id.etLname)
        etAge = findViewById(R.id.etAge)

        val fname = etFname.text.toString()
        val lname = etLname.text.toString()
        val age = etAge.text.toString()

        if (fname == "" || lname == "" || age == "") {
            Toast.makeText(this, "Please fill all required fields!", Toast.LENGTH_LONG).show()
            return
        }

        Intent(this, DisplayActivity::class.java).also {
            it.putExtra("first_name", fname)
            it.putExtra("last_name", lname)
            it.putExtra("age", age)
            startActivity(it)
        }
    }
}