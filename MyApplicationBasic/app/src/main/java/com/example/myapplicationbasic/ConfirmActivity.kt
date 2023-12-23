package com.example.myapplicationbasic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ConfirmActivity : AppCompatActivity() {

    var txtShowOrder : TextView? = null
    var txtName : TextView? = null
    var txtEmail : TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_confirm)

        txtShowOrder = findViewById(R.id.showOrder)
        txtName = findViewById(R.id.showName)
        txtEmail = findViewById<TextView>(R.id.showEmail)

        val getdata = intent
        txtShowOrder!!.text = getdata.getStringExtra("Order")
        txtName!!.text = getdata.getStringExtra("FullName")
        txtEmail!!.text = getdata.getStringExtra("Email")

    }
}