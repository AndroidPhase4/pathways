package com.Phase4.pathways

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInstance {

    val api: TechNewsApi by lazy {
        Retrofit.Builder()
//            .baseUrl("https://hn.algolia.com/")
            .baseUrl("https://jsonplaceholder.typicode.com")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(TechNewsApi::class.java)
    }
}