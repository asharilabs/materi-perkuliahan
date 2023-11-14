package com.example.bottomnavbartrm

import android.app.Activity
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class AdapterYangDibuat(
    private val context: Activity,
    private val title: Array<String>,
    private val imgid: Array<Int>)
    : ArrayAdapter<String>(context, R.layout.contoh_list, title){

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        val _inflater = context.layoutInflater
        val _rowView = _inflater.inflate(R.layout.contoh_list, null, true)

//        // definisi
        val _gambar = _rowView.findViewById<ImageView>(R.id.icon)
        val _nama = _rowView.findViewById<TextView>(R.id.title)
//
//        // isi data
        _gambar.setImageResource(imgid[position])
        _nama.setText(title[position])

        return _rowView
    }
}