package com.example.contohlistview

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // POSISI
        var posisi = arrayOf<String>(
            "Penjaga Gawang", 
            "Belakang", 
            "Belakang", 
            "Belakang", 
            "Belakang", 
            "Tengah",
            "Tengah",
            "Tengah",
            "Tengah",
            "Depan",
            "Depan"
            )
        // DATA
        var namanama = arrayOf<String>(
            "Teja Paku Alam",
            "Alberto",
            "Nick Kuipers",
            "Henhen Herdiana",
            "Mark Klok",
            "Ciro Alves",
            "Rezaldi Hehanusa",
            "Levy Madinda",
            "Dedi Kusnandar",
            "Beckham Putra",
            "David Da Silva")

        var fotofoto = arrayOf<Int>(
            R.drawable.teja,
            R.drawable.alberto,
            R.drawable.nick,
            R.drawable.henhen,
            R.drawable.mark,
            R.drawable.ciro,
            R.drawable.rezaldi,
            R.drawable.levy,
            R.drawable.dedi,
            R.drawable.beckham,
            R.drawable.david
        )

        // LIST VIEW
        // 1. definisi
        var _listview = findViewById<ListView>(R.id.listview_persib)
        // 2. buat adapter untuk listview tersebut
//        _listview.adapter = ArrayAdapter(
//            this, android.R.layout.simple_list_item_1, namanama
//        )
        _listview.adapter = AdapterBuatanKita(this, namanama, fotofoto, posisi)

        // 3. aksi untuk item yang ada di listview jika diklik
        // parameter i--> digunakan untuk mapping index dari item yang diklik
        _listview.setOnItemClickListener { adapterView, view, i, l ->

            // aksi memunculkan toast
            Toast.makeText(this,
                "item yang diklik adalah: " + _listview.getItemAtPosition(i),
                Toast.LENGTH_SHORT).show()

        }
    }
}
