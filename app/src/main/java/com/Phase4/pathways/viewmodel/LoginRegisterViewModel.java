package com.Phase4.pathways.viewmodel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;

import com.google.firebase.auth.FirebaseUser;
import com.Phase4.pathways.model.AppRepository;

public class LoginRegisterViewModel extends AndroidViewModel {
    private AppRepository AppRepository;
    private MutableLiveData<FirebaseUser> userLiveData;

    public LoginRegisterViewModel(@NonNull Application application) {
        super(application);
        AppRepository = new AppRepository(application);
        userLiveData = AppRepository.getUserLiveData();
    }

    public void login(String email, String password) {
        AppRepository.login(email, password);
    }

    public void register(String email, String password) {
        AppRepository.register(email, password);
    }

    public MutableLiveData<FirebaseUser> getUserLiveData() {
        return userLiveData;
    }
}