package com.example.contohlistviewdetail

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ArrayAdapter
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var nama_dep = arrayOf("Zhafira", "Kesya", "Raihan", "Kemal", "Andika", "Ghina")


        val simple_listview = findViewById<ListView>(R.id.listview_sederhana)
        simple_listview.adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, nama_dep)

        // click item
        simple_listview.setOnItemClickListener { adapterView, view, i, l ->
            Log.d("galihashari", "nama terpilih: " + adapterView.getItemAtPosition(i))

            Log.d("galihasharir", "item ke-" + nama_dep[i])

            val _intent = Intent(this, DetailActivity::class.java)
            _intent.putExtra("_index", i)

//            _intent.putExtra("namabelakang", nama_bel[i])
//            _intent.putExtra("alamat", alamat[i])

            startActivity(_intent)
        }
    }
}