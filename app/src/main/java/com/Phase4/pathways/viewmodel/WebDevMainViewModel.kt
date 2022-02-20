package com.Phase4.pathways.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.Phase4.pathways.model.DataResource

/*
 *      MainViewModel
 *      - viewModel that updates the MainFragment (the visible UI)
 *      - gets the data from model
 */

class WebDevMainViewModel: ViewModel() {

    // Create the model which contains data for our UI
    private val model = DataResource(textForUI = "Here's the updated text!")

    // Create MutableLiveData which MainFragment can subscribe to
    // When this data changes, it triggers the UI to do an update
    val uiTextLiveData = MutableLiveData<String>()

    // Get the updated text from our model and post the va0002++++lue to MainFragment
    fun getUpdatedText() {
        val updatedText = model.textForUI
        uiTextLiveData.postValue(updatedText)
    }

}