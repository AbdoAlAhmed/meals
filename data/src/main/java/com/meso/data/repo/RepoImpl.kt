package com.meso.data.repo

import com.meso.data.model.MealCategory
import com.meso.data.remote.ApiServices
import com.meso.domain.repo.RepoMeal

class RepoImpl(private val apiServices: ApiServices): RepoMeal {
    override suspend fun getMeals(): MealCategory = apiServices.getMeals()
}