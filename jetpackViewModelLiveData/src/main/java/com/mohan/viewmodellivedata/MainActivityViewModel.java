package com.mohan.viewmodellivedata;

import android.util.Log;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.Random;

public class MainActivityViewModel extends ViewModel {
    private String TAG =this.getClass().getSimpleName();
    private MutableLiveData<String> mRandomNumber;

    public MutableLiveData<String> getRandomNumber(){
        Log.i(TAG,"Get Number");
        if(mRandomNumber==null){
            mRandomNumber= new MutableLiveData<String>();
            createNumber();
        }
        return mRandomNumber;
    }

    public void createNumber() {
        Log.i(TAG,"Create New number");
        Random mRandom=new Random();
        //mRandomNumber = "Number:" + (mRandom.nextInt(100-1)+1);
        mRandomNumber.setValue("Number:" + (mRandom.nextInt(100-1)+1));
    }

    @Override
    protected void onCleared() {
        super.onCleared();
        Log.i(TAG,"Cleared View Model");
    }
}
