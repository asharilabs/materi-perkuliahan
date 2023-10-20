package com.example.bottomnavimenu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.bottomnavimenu.fragments.HelpFragment
import com.example.bottomnavimenu.fragments.HomeFragment
import com.example.bottomnavimenu.fragments.MusicFragment
import com.example.bottomnavimenu.fragments.TimerFragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var bottomnavbar = findViewById<BottomNavigationView>(R.id.bottomnav)
        bottomnavbar.setOnItemSelectedListener {

            when(it.itemId){
                R.id.menu_home ->{
                    LoadFragment(HomeFragment())
                    true
                }
                R.id.menu_help ->{
                    LoadFragment(HelpFragment())
                    true
                }
                R.id.menu_musicvideo ->{
                    LoadFragment(MusicFragment())
                    true
                }
                R.id.menu_timer ->{
                    LoadFragment(TimerFragment())
                    true
                }
                else -> {false}
            }
        }
    }

    private fun LoadFragment(_fragment: Fragment){
        val transaksi = supportFragmentManager.beginTransaction()
        transaksi.replace(R.id.fcontainer, _fragment)
        transaksi.commit()
    }
}