package com.moutamid.koltlin_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button_1 = findViewById<Button>(R.id.button_1);
        button_1.setOnClickListener {
            Toast.makeText(this@MainActivity, "Congratulations..." , Toast.LENGTH_LONG).show()
        }

        val button_2 = findViewById<Button>(R.id.button_2);
        button_2.setOnClickListener {
            val intent = Intent(this,RecylcerView_Activity::class.java)
            startActivity(intent)
        }
    }
}