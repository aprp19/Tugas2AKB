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
import android.view.View
import android.widget.AdapterView
import android.widget.Button
import android.widget.Spinner
import kotlinx.android.synthetic.main.activity_register.*

class RegisterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        try {
            this.supportActionBar!!.hide()
        } catch (e: NullPointerException) {}
        setContentView(R.layout.activity_register)
        Utils.makeSharedPref(this)

        val r_blood : Spinner = findViewById(R.id.r_blood)
        r_blood.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onNothingSelected(parent: AdapterView<*>?) {
                TODO("Not yet implemented")
            }
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                pos: Int,
                id: Long) {
                Utils.putSharedPref(Utils.BloodType,pos)
            }
        }

        val register = findViewById<Button>(R.id.r_btn_register)
        register.setOnClickListener {
            Utils.putSharedPref(Utils.UsrName, r_edtText_nama.text.toString())
            startActivity(Intent(this,Verify1Activity::class.java))
        }
    }
}
