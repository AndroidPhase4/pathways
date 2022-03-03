package com.Phase4.pathways

import retrofit2.Response
import retrofit2.http.GET

interface TechNewsApi {

    // HACKERNEWS API
//    @GET("/api/v1/search?tags=front_page")

    @GET("/todos")
    fun getHits(): Response<List<Hit>>
}