package com.faircorp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.faircorp.Constants.WINDOW_NAME_PARAM


class MainActivity : BasicActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    /** Called when the user taps the button */
    //fun openWindow(view: View) {
        //val windowName = findViewById<EditText>(R.id.txt_window_name).text.toString()

        // Do something in response to button
        //val intent = Intent(this, WindowActivity::class.java).apply {
            //putExtra(Constants.WINDOW_NAME_PARAM, windowName)
        //}
        //startActivity(intent)

    //}
}
