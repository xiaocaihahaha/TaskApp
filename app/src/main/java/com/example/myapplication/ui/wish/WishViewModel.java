package com.example.myapplication.ui.wish;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class WishViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public WishViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is wish fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}