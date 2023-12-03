package com.example.contohlistviewdetail

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

        var nama_dep = arrayOf("Zhafira", "Kesya", "Raihan", "Kemal", "Andika", "Ghina")
        var nama_bel = arrayOf("Najla", "N", "raihan", "MKP", "andika", "Ghina")
        var alamatdata = arrayOf("B", "B", "J", "A", "Y", "F")
        var fotofoto = arrayOf(R.drawable.ic_launcher_background)

        // definisi widget
        // - nama
        val _detail_nama_depan = findViewById<TextView>(R.id.detail_nama_depan)
        _detail_nama_depan.setText("")


        // - nama belakang
        val _detail_nama_belakang = findViewById<TextView>(R.id.detail_nama_belakang)
        // - alamat
        val _detail_alamat = findViewById<TextView>(R.id.detail_alamat)
        // - foto
        val _detail_foto = findViewById<ImageView>(R.id.detail_logo)

        // get value dari intent
        val _indexdarimain = intent.getIntExtra("_index", 0)
        _detail_nama_depan.setText(nama_dep[_indexdarimain])
        _detail_nama_belakang.setText(nama_bel[_indexdarimain])
        _detail_alamat.setText(alamatdata[_indexdarimain])
        _detail_foto.setImageResource(fotofoto[_indexdarimain])


//        val _nilai_namadep = intent.getStringExtra("namakedetail")
//        _detail_nama_depan.setText(_nilai_namadep)
//        val _nilai_namabel = intent.getStringExtra("namabelakang")
//        _detail_nama_belakang.setText(_nilai_namabel)
//        val alamat = intent.getStringExtra("alamat")
//        _detail_alamat.setText(alamat)
    }
}