package com.example.bottomaa

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import com.example.bottomaa.fragments.fCalculator
import com.example.bottomaa.fragments.fHome
import com.example.bottomaa.fragments.fMoneyConversion
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loadFragment(fHome())

        var bottomnavmenu = findViewById<BottomNavigationView>(R.id.bottom_nav)
        bottomnavmenu.setOnItemSelectedListener {
            when(it.itemId){
                R.id.bot_menu_home ->{

                    loadFragment(fHome())
                    true
                }
                R.id.bot_menu_calculator ->{

                    loadFragment(fCalculator())
                    true
                }
                R.id.bot_menu_money ->{

                    loadFragment(fMoneyConversion())
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