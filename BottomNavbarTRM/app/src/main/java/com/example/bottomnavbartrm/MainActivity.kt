package com.example.bottomnavbartrm

import android.annotation.SuppressLint
import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Button
import android.widget.FrameLayout
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var _nilaidarisebelum = intent.getStringExtra("Username")


        var btnclick = findViewById<Button>(R.id.btn_click_act)
        btnclick.setOnClickListener {

            // paste kesini
            // alert dialog
            var _alertdialog = AlertDialog.Builder(this)
            _alertdialog.setTitle("PPBM-03")
            _alertdialog.setMessage("Auto-Save mode?")
            _alertdialog.setIcon(R.drawable.mu24)

            _alertdialog.setPositiveButton("Gasken", { dialogInterface, i ->
                Toast.makeText(this, "Tombol gasken diklik", Toast.LENGTH_LONG).show()
            })
            _alertdialog.setNegativeButton("Cancel", { dialogInterface, i ->
                Toast.makeText(this, "Tombol Cancel diklik", Toast.LENGTH_LONG).show()
            })
            _alertdialog.setNeutralButton("Gak jadi", { dialogInterface, i ->
                Toast.makeText(this, "Tombol Gak jadi diklik", Toast.LENGTH_LONG).show()
            })

            _alertdialog.show()
        }




        var bottom_nav = findViewById<BottomNavigationView>(R.id.bottom_nav_id)
        bottom_nav.setOnItemSelectedListener {
            when(it.itemId){

                R.id.menu_btm_home -> {
                    loadFragment(fHome())
                    true
                }
                R.id.menu_btm_mu24 -> {
                    loadFragment(fMU())
                    true
                }
                R.id.menu_btm_location -> {
                    loadFragment(fLocation())
                    true
                }
                R.id.menu_btm_grafik -> {
                    loadFragment(fGrafik())
                    true
                }

                else -> {
                    false
                }
            }
        }
    }
    private  fun loadFragment(fragment: Fragment){
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.container,fragment)
        transaction.commit()
    }
}