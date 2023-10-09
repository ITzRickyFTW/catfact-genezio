package com.example.catfact

import com.google.gson.GsonBuilder
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object TextAdapter {
     private val baseURL = "https://catfact.ninja/"

     fun getInstance(): Retrofit
     {
          return Retrofit.Builder().baseUrl(baseURL).addConverterFactory(GsonConverterFactory.create()).build()
     }

}