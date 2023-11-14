package com.example.bottomnavbartrm

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetailActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        var text = findViewById<TextView>(R.id.texttext)
        text.setText(intent.getStringExtra("nama"))
        var gambar = findViewById<ImageView>(R.id.gambarpemain)
        gambar.setImageResource(intent.getIntExtra("foto", 0))
    }
}