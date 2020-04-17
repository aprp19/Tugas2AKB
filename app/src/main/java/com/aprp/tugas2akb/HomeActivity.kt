/*
NAMA    : ANGGA PUJA RESTU PRAKASA
NIM     : 10117130
KELAS   : IF4

TANGGAL PENGERJAAN : 16 - APRIL - 2020
 */

package com.aprp.tugas2akb

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Switch
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        try {
            this.supportActionBar!!.hide()
        } catch (e: NullPointerException) {}
        setContentView(R.layout.activity_home)

        Utils.makeSharedPref(this)

        val getNama = Utils.getStringSharedPref(Utils.UsrName)
        h_txt_nama.text = getNama

        val getBloodType = Utils.getIntSharedPref(Utils.BloodType).toString()

        if (getBloodType == "1"){
            h_get_blood.text = " A"
        } else if(getBloodType == "2"){
            h_get_blood.text = " B"
        } else if(getBloodType == "3"){
            h_get_blood.text = " AB"
        } else if(getBloodType == "4"){
            h_get_blood.text = " O"
        } else{
            h_get_blood.text = " Null"
        }
    }
}
