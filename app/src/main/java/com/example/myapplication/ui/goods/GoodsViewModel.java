package com.example.myapplication.ui.goods;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class GoodsViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public GoodsViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is goods fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}