package com.Phase4.pathways

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class TechNewsViewModel(
    val techNewsRepository: TechNewsRepository
): ViewModel() {

    // The list of tech news represents a state (a value that changes over time).
    // we store it in a StateFlow. It keeps the value and tells the UI about it once
    // it changes or there is a config change. That way, you don't refetch the data
    // when rotating the device.
    private val _techNews = MutableStateFlow(emptyList<Hit>())
    val techNews = _techNews.asStateFlow()

    init {
        getTechNews()
    }

    fun getTechNews() = viewModelScope.launch {
        val response = techNewsRepository.getTechNews()

        // If everything is successful, we store the result in our StateFlow
        // so the UI will be notified about the new list.
        // repo shouldn't return the response directly, instead it
        // should handle it and return the list directly or an error if something failed.
        // That way, you have a clearer separation of concerns (business logic in the VM,
        // data logic in the repo)

        if(response.isSuccessful) {
            _techNews.value = response.body() ?: emptyList()
        }
    }

}