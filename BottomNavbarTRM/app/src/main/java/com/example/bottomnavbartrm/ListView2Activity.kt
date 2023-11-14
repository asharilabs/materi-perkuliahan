package com.example.bottomnavbartrm

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class ListView2Activity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_view2)

        // siapin variable array yang mempunyai nilai
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
        
        // definisi list view
        val _list = findViewById<ListView>(R.id.listview3)
        _list.adapter = AdapterCustom(this, namanama, fotofoto)
        _list.setOnItemClickListener { adapterView, view, i, l ->
            Toast.makeText(this, "nama: " + namanama.get(i), Toast.LENGTH_LONG).show()

            val _intent = Intent(this, DetailActivity::class.java)
            _intent.putExtra("nama", namanama.get(i))
            _intent.putExtra("foto", fotofoto.get(i))
            startActivity(_intent)
        }
    }
}