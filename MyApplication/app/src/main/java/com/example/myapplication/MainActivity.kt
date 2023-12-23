package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    var movies = arrayOf(
        "Item1",
        "Item2",
        "Item3",
        "Item4",
        "Item5",
        "Item6",
        "Item7",
        "Item8",
        "Item9",
        "Item10",
        "Item11",
        "Item12",
        "Item13",
        "Item14",
        "Item15"
    )
    var recycleview: RecyclerView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recycleview = findViewById<RecyclerView>(R.id.ricyclerview)
        recycleview!!.layoutManager = LinearLayoutManager(this)
        val itemAdapter = MyAdapter(movies,this)
        recycleview!!.setAdapter(itemAdapter)
    }
}