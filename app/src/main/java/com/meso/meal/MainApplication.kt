package com.meso.meal

import android.app.Application
import com.meso.meal.di.mealsModule
import org.koin.core.context.startKoin

class MainApplication: Application(){
    override fun onCreate() {
        super.onCreate()

        startKoin {
            modules(mealsModule)
        }
    }
}