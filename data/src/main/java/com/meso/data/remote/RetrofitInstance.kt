package com.meso.data.remote

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

class RetrofitInstance {

    private fun client(): OkHttpClient {
        var boday = HttpLoggingInterceptor()
        boday.setLevel(HttpLoggingInterceptor.Level.BODY)
        return OkHttpClient.Builder().addInterceptor(boday).
            readTimeout(1000,TimeUnit.SECONDS).callTimeout(1000,TimeUnit.SECONDS).build()
    }

    private fun retrofit(): Retrofit {
        return Retrofit.Builder().baseUrl("https://www.themealdb.com/api/json/v1/1/")
            .addConverterFactory(GsonConverterFactory.create())
            .client(client())
            .build()
    }

    fun ApiServices(): ApiServices {
        return retrofit().create(ApiServices::class.java)
    }


}