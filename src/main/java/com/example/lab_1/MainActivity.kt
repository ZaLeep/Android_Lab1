package com.example.lab_1

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.*

class MainActivity : AppCompatActivity() {
    private lateinit var button : Button
    private lateinit var spinner : Spinner
    private lateinit var group : RadioGroup
    private lateinit var result : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button = findViewById(R.id.button)
        spinner = findViewById(R.id.spinner)
        group = findViewById(R.id.radioGroup)
        result = findViewById(R.id.textView4)
        spinner.setSelection(4)

        button.setOnClickListener{
            if (group.checkedRadioButtonId == -1 || spinner.selectedItemPosition == 4) {
                Toast.makeText(getApplicationContext(),
                    "Please, select each parameter.",
                    Toast.LENGTH_LONG).show();
            }
            else {
                val author: String = spinner.getSelectedItem() as String
                val selectedRadioButton = findViewById<RadioButton>(group.checkedRadioButtonId)
                val year: String = selectedRadioButton.text as String
                result.setText("$author: $year")
            }
        }
    }
}