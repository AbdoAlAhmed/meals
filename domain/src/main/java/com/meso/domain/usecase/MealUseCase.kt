package com.meso.domain.usecase

import com.meso.data.model.MealCategory
import com.meso.domain.repo.RepoMeal

class MealUseCase (private val repo: RepoMeal) {

    suspend fun getMeal(): MealCategory = repo.getMeals()
}