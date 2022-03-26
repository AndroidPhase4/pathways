package com.Phase4.pathways.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.Phase4.pathways.models.AppRepository
import androidx.lifecycle.MutableLiveData
import com.google.firebase.auth.FirebaseUser

class LoggedInViewModel(application: Application) : AndroidViewModel(application) {
    private val authAppRepository: AppRepository
    val userLiveData: MutableLiveData<FirebaseUser>
    val loggedOutLiveData: MutableLiveData<Boolean>
    fun logOut() {
        authAppRepository.logOut()
    }

    init {
        authAppRepository = AppRepository(application)
        userLiveData = authAppRepository.userLiveData
        loggedOutLiveData = authAppRepository.loggedOutLiveData
    }
}