package com.meso.meal

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.meso.data.model.Category
import com.meso.domain.usecase.MealUseCase
import kotlinx.coroutines.launch

class MainViewModel  (private val useCase: MealUseCase) : ViewModel(){
    private var _listOfMeals = MutableLiveData<List<Category>?>()
    val  listOfMeals: LiveData <List<Category>?>
        get() = _listOfMeals

    init {
        getMealz()
    }
    fun getMealz(){
        viewModelScope.launch {
            _listOfMeals.value = useCase.getMeal().categories
            Log.d("_listOfMeals", "getMealz: ${useCase.getMeal().categories}")
        }
    }

}