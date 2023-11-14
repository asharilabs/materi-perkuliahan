package com.example.bottomnavbartrm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class ListViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_view)

        var bahasa = listOf("Sunda", "Jawa", "Batak", "Betawi")

        val mylist = findViewById<ListView>(R.id.mylistview)
        mylist.adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, bahasa)

        mylist.setOnItemClickListener { adapterView, view, i, l ->
            Toast.makeText(this, "memilih ${bahasa[i]}", Toast.LENGTH_LONG).show()
        }
    }
}