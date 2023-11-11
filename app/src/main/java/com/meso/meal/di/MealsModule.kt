package com.meso.meal.di

import com.meso.data.remote.RetrofitInstance
import com.meso.domain.repo.RepoMeal
import com.meso.domain.usecase.MealUseCase
import com.meso.meal.MainViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module


val mealsModule = module {
    single {
        RetrofitInstance()
    }
    single {
        RepoMeal(get())
    }
    single {
        MealUseCase(get())
    }
    viewModel {
        MainViewModel(get())
    }
}