package com.meso.meal

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.meso.data.model.Category
import com.meso.domain.usecase.MealUseCase
import kotlinx.coroutines.launch
import javax.inject.Inject


class MainViewModel @Inject constructor(private val useCase: MealUseCase) : ViewModel(){
    private var _listOfMeals = MutableLiveData<List<com.meso.data.model.Category>>()
    val  listOfMeals: LiveData <List<com.meso.data.model.Category>>
        get() = _listOfMeals
    init {
        getMealz()
    }

    fun getMealz(){
        viewModelScope.launch {
            _listOfMeals.value = useCase.getMeal().categories
        }
    }

}