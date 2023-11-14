package com.example.bottomnavbartrm

import android.annotation.SuppressLint
import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import org.w3c.dom.Text

class MainActivity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        // init widget (komponen UI)
        var iusername = findViewById<EditText>(R.id.input_username)
        var ipassword = findViewById<EditText>(R.id.input_password)
        var btnLogin = findViewById<Button>(R.id.btn_login)
        var btnClear = findViewById<Button>(R.id.btn_clear)

        btnLogin.setOnClickListener {

            var isianusername = iusername.text.toString()
            var isianpassword = ipassword.text.toString()

            if( isianusername != "" &&
                isianpassword != "")
            {
                // B - lanjut ke pengecekkan selanjutnya (username-password match?)
                if( isianusername.equals("telU") &&
                    isianpassword.equals("ppbm-01")){
                    // password + username cocok

                    val _intent = Intent(this, MainActivity::class.java)
                    _intent.putExtra("username", isianusername)
                    startActivity(_intent)

                }
                else{
                    // password + username mismatch
                    Toast.makeText(this,
                        "pass+user mismatch",
                        Toast.LENGTH_LONG).show()

                    val alert = AlertDialog.Builder(this)
                    alert.setTitle("Pesan")
                    alert.setMessage("Pass+User Mismatch")
                    alert.show()
                }
            }
            else
            {
                // A - kasih peringatan jangan ada yang kosong
            }
        }
        btnClear.setOnClickListener {

        }
    }


}