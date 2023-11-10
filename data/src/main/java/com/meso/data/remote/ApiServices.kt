package com.meso.data.remote

import com.meso.data.model.MealCategory
import retrofit2.http.GET

interface ApiServices {
    @GET("categories.php")
    suspend fun getMeals(): MealCategory
}