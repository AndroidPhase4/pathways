package com.Phase4.pathways

import retrofit2.Response
import retrofit2.http.GET

interface TechNewsApi {

    @GET("/posts")
    suspend fun getHits(): Response<List<Hit>>

}








//     HACKERNEWS API
//   @GET("/api/v1/search?tags=front_page")
//    suspend fun getHits(): Response<List<Hit>>

//   @GET("api/v1/search?query=tech&tags=story#")
//    suspend fun getHits(): Response<List<Hit>>

//
//    @GET("/todos")
//    suspend fun getHits(): Response<List<Hit>>
