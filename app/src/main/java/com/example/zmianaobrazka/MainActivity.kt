package com.example.zmianaobrazka

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.button1).setOnClickListener {
            findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.diho)
        }
        findViewById<Button>(R.id.button2).setOnClickListener {
            findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.malik_montana)
        }
        findViewById<Button>(R.id.button3).setOnClickListener {
            findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.arka_gdynia)
        }
        findViewById<Button>(R.id.button4).setOnClickListener {
            findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.sklasa1)
        }























































































    }
}