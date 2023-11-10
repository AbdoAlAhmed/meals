package com.meso.meal.di

import com.meso.data.remote.ApiServices
import com.meso.meal.util.Constants.Companion.BASE_URL
import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

@Module
object Network {
    @Provides
    fun client():OkHttpClient{
        return OkHttpClient.Builder().build()
    }

    @Provides
    fun retrofit (client: OkHttpClient): Retrofit{
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .client(client)
            .build()
    }
    @Provides
    fun apiServices(retrofit: Retrofit):ApiServices{
        return retrofit.create(ApiServices::class.java)
    }

}