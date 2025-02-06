package edu.temple.inclassuiacvitivity

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import android.widget.AdapterView.OnItemSelectedListener

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val spinner = findViewById<Spinner>(R.id.spinner)

        val layout = findViewById<View>(R.id.main)

        val displayTextView = findViewById<TextView>(R.id.textDisplay)



        /* TODO Step 2: Populate this array with multiples of 5 from 5 - 100*/
        val multfive = arrayOf(
            5F,10F,15F,20F,25F,30F,35F,40F,45F,50F,55F,60F,65F,70F,75F
            ,80F,85F, 90.0F, 95.0F, 100.0F
        )

        /* TODO Step 3: Create adapter to display items from array in Spinner */
        //spinner.adapter = ArrayAdapter...
        val Adapter  = ArrayAdapter(this@MainActivity, android.R.layout.simple_dropdown_item_1line, multfive)
        spinner.adapter = Adapter
        // TODO Step 4: Change TextView's text size to the number selected in the Spinner */
        //spinner.onItemSelectedListener = object: ...
        spinner.onItemSelectedListener = object: OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                val textsize = p0?.getItemAtPosition(p2) as Float
                displayTextView.setTextSize(textsize)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {}

        }



    }
}