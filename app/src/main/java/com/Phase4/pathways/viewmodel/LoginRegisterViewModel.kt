package com.Phase4.pathways.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.Phase4.pathways.model.AppRepository
import androidx.lifecycle.MutableLiveData
import com.google.firebase.auth.FirebaseUser

class LoginRegisterViewModel(application: Application) : AndroidViewModel(application) {
    private val AppRepository: AppRepository
    val userLiveData: MutableLiveData<FirebaseUser>
    fun login(email: String?, password: String?) {
        AppRepository.login(email, password)
    }

    fun register(email: String?, password: String?) {
        AppRepository.register(email, password)
    }

    init {
        AppRepository = AppRepository(application)
        userLiveData = AppRepository.userLiveData
    }
}