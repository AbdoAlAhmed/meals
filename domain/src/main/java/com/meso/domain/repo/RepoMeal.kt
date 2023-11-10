package com.meso.domain.repo

import com.meso.data.model.MealCategory


interface RepoMeal {
    suspend fun getMeals(): MealCategory
}