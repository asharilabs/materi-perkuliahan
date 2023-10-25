package com.example.bottombbnav

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loadFragment(fLocation())

        // definisi widget
        var bottomnav = findViewById<BottomNavigationView>(R.id.bottomnavview)
        bottomnav.setOnItemSelectedListener {

            when(it.itemId){

                R.id.bot_menu_home -> {
                    loadFragment(fHome())
                    true
                }
                R.id.bot_menu_location -> {
                    loadFragment(fLocation())
                    true
                }
                R.id.bot_menu_camera -> {
                    loadFragment(fCamera())
                    true
                }

                else -> {false}
            }
        }
    }
    private  fun loadFragment(fragment: Fragment){
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.f_container,fragment)
        transaction.commit()
    }
}