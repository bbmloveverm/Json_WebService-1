package com.example.json_webservice

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView


class MyAdapter(private val postList: List<Coffee>, private val context: Context) : RecyclerView.Adapter<ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.coffee_item,parent,false))
    }

    override fun getItemCount(): Int {
        return postList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.BindTextValue!!.text = postList[position].title
        holder.BindContentValue!!.text = postList[position].content
        holder.BindCardView!!.setOnClickListener{

            val intent = Intent(context,DetailActivity::class.java)
            intent.putExtra("ID",postList[position].id)
            context!!.startActivity(intent)
        }
    }

}