package com.example.json_webservice

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView

class ViewHolder (itemView:View): RecyclerView.ViewHolder(itemView){

    val BindTextValue: TextView? = itemView.findViewById(R.id.txtTitle)
    val BindContentValue: TextView?= itemView.findViewById(R.id.txtContent)
    val BindImageView: ImageView? = itemView.findViewById(R.id.image_View)
    val BindCardView: CardView? = itemView.findViewById(R.id.cardView)
}
