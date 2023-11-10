package com.meso.meal.di

import com.meso.data.remote.ApiServices
import com.meso.data.repo.RepoImpl
import com.meso.domain.repo.RepoMeal
import dagger.Module

@Module
object RepoModule {
    fun provideRepo (apiServices: ApiServices):RepoMeal{
        return RepoImpl(apiServices)
    }
}