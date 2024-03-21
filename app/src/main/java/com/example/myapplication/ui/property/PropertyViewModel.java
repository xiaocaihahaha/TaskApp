package com.example.myapplication.ui.property;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class PropertyViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public PropertyViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is property fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}