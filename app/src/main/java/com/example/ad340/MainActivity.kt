package com.example.ad340

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val ZipCode : TextView = findViewById(R.id.Zip_Code_Text)
        val ZipCodeEntry : EditText = findViewById(R.id.Zip_Code_Edit)
        val Submit : Button = findViewById(R.id.Submit)

        Submit.setOnClickListener {
            val ZipCodeNumber = ZipCodeEntry.text

            if (ZipCodeNumber.length == 5) {
            Toast.makeText(this, ZipCodeNumber, Toast.LENGTH_SHORT).show()
        }
            else {
                Toast.makeText(this, R.string.Error_zipcode, Toast.LENGTH_SHORT).show()
            }

        }

    }

    override fun onStart() {
        super.onStart()
    }

    override fun onResume() {
        super.onResume()
    }

    override fun onPause() {
        super.onPause()
    }

    override fun onStop() {
        super.onStop()
    }

    override fun onDestroy() {
        super.onDestroy()
    }
}
