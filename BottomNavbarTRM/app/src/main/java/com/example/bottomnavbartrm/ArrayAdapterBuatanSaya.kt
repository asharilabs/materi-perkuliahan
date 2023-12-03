package com.example.bottomnavbartrm

import android.annotation.SuppressLint
import android.app.Activity
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import de.hdodenhof.circleimageview.CircleImageView

class ArrayAdapterBuatanSaya (private val context: Activity,
                              private val nama: Array<String>,
                              private val foto: Array<Int>,
                                private val deskripsi: Array<String>)
    : ArrayAdapter<String>(context, R.layout.ig_chatgpt, nama) {

    @SuppressLint("MissingInflatedId")
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val inflater = context.layoutInflater
        val rowView = inflater.inflate(R.layout.ig_chatgpt, null, true)

        // definisi
        var _image = rowView.findViewById<ImageView>(R.id.postimage)
        var _nama = rowView.findViewById<TextView>(R.id.username)

        // isi nilai
        _image.setImageResource(foto[position])
        _nama.setText(nama[position])

        return rowView
    }
}