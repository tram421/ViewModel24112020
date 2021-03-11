package com.tram.viewmodel24112020saulocation;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MyViewModel extends ViewModel {
    MutableLiveData<Integer> mMutableInteger;

//khong co tham so
    public MyViewModel() {
        this.mMutableInteger = mMutableInteger;
    }
    //call Database
    public void setCount(int count){
        mMutableInteger.setValue(count);
    }
    public LiveData<Integer> getCount(){
        return mMutableInteger;
    }
}
