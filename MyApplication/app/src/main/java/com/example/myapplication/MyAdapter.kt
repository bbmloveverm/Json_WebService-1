package com.example.myapplication

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter (private  var items: Array<String>, val context: Context): RecyclerView.Adapter<ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.row,parent,false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
       return items.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindTextValues!!.text = items[position]
    }

}
class ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){

    val bindTextValues: TextView? = itemView.findViewById(R.id.txtTitle)
}