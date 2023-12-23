package com.example.json_webservice

import io.reactivex.rxjava3.core.Observable
import retrofit2.http.GET

interface INetworkAPI {
    @GET("coffee.json")
    fun getAllData(): Observable<List<Coffee>>

}