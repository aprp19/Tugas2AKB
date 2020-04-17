/*
NAMA    : ANGGA PUJA RESTU PRAKASA
NIM     : 10117130
KELAS   : IF4

TANGGAL PENGERJAAN : 16 - APRIL - 2020
 */

package com.aprp.tugas2akb

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Verify2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_verify2)
        try {
            this.supportActionBar!!.hide()
        } catch (e: NullPointerException) {}

        val send = findViewById<Button>(R.id.v2_btn_send)
        send.setOnClickListener{
            startActivity(Intent(this,HomeActivity::class.java))
        }
    }
}
