package com.aprp.tugas2akb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        Utils.makeSharedPref(this)

        val getNama = Utils.getSharedPref(Utils.UsrName)
        h_txt_nama.setText(getNama)

        val getBloodType = Utils.getSharedPref(Utils.BloodType)

        if (getBloodType.toInt() == 1){
            
        }
    }
}
