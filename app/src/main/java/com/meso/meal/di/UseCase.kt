package com.meso.meal.di

import com.meso.data.repo.RepoImpl
import com.meso.domain.usecase.MealUseCase
import dagger.Module
import dagger.Provides

@Module
object UseCase {
    @Provides
    fun provideUseCase(repoImpl: RepoImpl):MealUseCase{
        return MealUseCase(repoImpl)
    }
}