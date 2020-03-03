package com.mohan.viewmodellivedata;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ARetrofitClient {

    private static String BASE_URL="https://api.stackexchange.com/2.2/";
    //Create Instance for ARRetrofitClient by Singleton
    private static ARetrofitClient mRetrofitClientInstance;
    //Create Instance for Retrofit Library
    private Retrofit mRetorfit;

    //Intializing Constructor
    public ARetrofitClient() {
        mRetorfit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    //Create singleton instance for this class
    public static synchronized ARetrofitClient getInstance(){
        if(mRetrofitClientInstance == null){
            mRetrofitClientInstance = new ARetrofitClient();

        }
        return mRetrofitClientInstance;
    }
    public Api getApi(){
        return mRetorfit.create(Api.class);
    }
}
