package com.example.bottomnavbartrm

import android.app.Activity
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class AdapterCustom (private val context: Activity,
                     private val title: Array<String>,
                     private val imgid: Array<Int>)
    : ArrayAdapter<String>(context, R.layout.layoutbuatanadapter, title) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        val inflater = context.layoutInflater
        val rowView = inflater.inflate(R.layout.layoutbuatanadapter, null, true)

        var _image = rowView.findViewById<ImageView>(R.id.icon)
        _image.setImageResource(imgid[position])

        var _name = rowView.findViewById<TextView>(R.id.title)
        _name.setText(title[position])

        return rowView
    }
}