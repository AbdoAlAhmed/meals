package com.meso.domain.repo

import com.meso.data.remote.RetrofitInstance

class RepoMeal (private val retrofitInstance: RetrofitInstance) {
   suspend fun getMeals () = retrofitInstance.ApiServices().getMeals()
}