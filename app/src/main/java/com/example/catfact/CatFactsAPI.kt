package com.example.catfact

import retrofit2.Response
import retrofit2.http.GET

interface CatFactsAPI {
    @GET("/fact")
    suspend fun getFact(): Response<CatFact>
}