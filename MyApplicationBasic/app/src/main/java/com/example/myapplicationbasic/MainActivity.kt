package com.example.myapplicationbasic

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {



    var cardView1 : CardView? = null
    var cardView2 : CardView? = null
    var cardView3: CardView? = null
    var cardView4 : CardView? = null
    var btn_Ricy_Vie: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        cardView1 = findViewById(R.id.CardView1)
        cardView2 = findViewById(R.id.Cardview2)
        cardView3 = findViewById(R.id.CardView3)
        cardView4 = findViewById(R.id.CardView4)
        btn_Ricy_Vie = findViewById<Button>(R.id.btn_ar_ricy_vie)


        cardView1!!.setOnClickListener {
            val intent = Intent(this,DetailActivity::class .java)
            intent.putExtra("Order","หมาน่ารัก")
            startActivity(intent)
        }

        cardView2!!.setOnClickListener{
            val intent = Intent(this,DetailActivity::class.java)
            intent.putExtra("Order","หมาสีดำ")
            startActivity(intent)
        }

        cardView3!!.setOnClickListener {
            val intent = Intent(this,DetailActivity::class.java)
            intent.putExtra("Order","หมาสีขาว")
            startActivity(intent)
        }

        btn_Ricy_Vie!!.setOnClickListener {
            val intent = Intent(this,Array_RicycleView::class.java)
            startActivity(intent)

        }

    }



}



