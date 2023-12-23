package com.example.myapplicationbasic

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView

class DetailActivity : AppCompatActivity() {


    var txtOrder : TextView? = null
    var editname : EditText? = null
    var editEmail : EditText? = null
    var btnConfirm : Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        txtOrder = findViewById(R.id.textOrder)
        editname = findViewById(R.id.editName)
        editEmail = findViewById(R.id.editEmail)
        btnConfirm = findViewById(R.id.btnConfirm)

        var intent = getIntent()
        txtOrder!!.text = intent.getStringExtra("Order")

        btnConfirm!!.setOnClickListener {
            val dataIntent = Intent(this,ConfirmActivity::class.java)
            dataIntent.putExtra("Order",intent.getStringExtra("Order"))
            dataIntent.putExtra("FullName",editname!!.text.toString())
            dataIntent.putExtra("Email",editEmail!!.text.toString())
            startActivity(dataIntent)
        }



        //Log.e("Order",intent)

    }
}