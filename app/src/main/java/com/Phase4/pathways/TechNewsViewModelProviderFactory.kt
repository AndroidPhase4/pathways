package com.Phase4.pathways

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class TechNewsViewModelProviderFactory(
    val techNewsRepository: TechNewsRepository
): ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return TechNewsViewModel(techNewsRepository) as T
    }
}