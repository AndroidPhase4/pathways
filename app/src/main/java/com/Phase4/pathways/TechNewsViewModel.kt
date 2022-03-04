package com.Phase4.pathways

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class TechNewsViewModel(
    val techNewsRepository: TechNewsRepository
): ViewModel() {

    init {
        getTechNews()
    }

    fun getTechNews() = viewModelScope.launch {
        val response = techNewsRepository.getTechNews()
    }

}