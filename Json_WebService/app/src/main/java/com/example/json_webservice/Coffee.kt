package com.example.json_webservice

import com.google.gson.annotations.SerializedName

class Coffee (
    @SerializedName("id") val id: Int,
    @SerializedName("title") val title:String,
    @SerializedName("thumbnail") val thumbnail:String,
    @SerializedName("content") val content:String
)