package com.mohan.viewmodellivedata;

import androidx.annotation.NonNull;
import androidx.lifecycle.MutableLiveData;
import androidx.paging.DataSource;
import androidx.paging.PageKeyedDataSource;

public class ItemDataSourceFactory extends DataSource.Factory {
    //Initialize the MutableLiveData with DatasourceItems
    MutableLiveData<PageKeyedDataSource<Integer,Item>> itemLiveDataSource=new MutableLiveData<PageKeyedDataSource<Integer,Item>>();

    @NonNull
    @Override
    public DataSource create() {
        ItemDataSource mItemDataSource = new ItemDataSource();
        itemLiveDataSource.postValue(mItemDataSource);
        return mItemDataSource;
    }

    public MutableLiveData<PageKeyedDataSource<Integer, Item>> getItemLiveDataSource() {
        return itemLiveDataSource;
    }
}
