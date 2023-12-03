package com.example.bottomnavbartrm

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class ListView3Activity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_view3)

        // 1. buat data dulu string array
        var nama = arrayOf(
            "Teja Paku Alam",
            "Nick Kuipers",
            "Ciro Alves"
        )
        var fotofoto = arrayOf(
            R.drawable.teja,
            R.drawable.nick,
            R.drawable.ciro
        )
        var deskripsi = arrayOf(
            "deskripsi teja",
            "deskripsi nick",
            "deskripsi ciro"
        )
        // nama[0], nama[1]
        // -------------------------------------------

        // 2. definisikan listview yang ada di xml
        val _list3 = findViewById<ListView>(R.id.listview3)
        // 3. isikan nilai-nilai data ke listview menggunakan adapter
//        _list3.adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, nama)
        _list3.adapter = ArrayAdapterBuatanSaya(this, nama, fotofoto, deskripsi)
    }
}