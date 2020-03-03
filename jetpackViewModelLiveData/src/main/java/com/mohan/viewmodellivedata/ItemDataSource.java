package com.mohan.viewmodellivedata;

import androidx.annotation.NonNull;
import androidx.paging.PageKeyedDataSource;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ItemDataSource  extends PageKeyedDataSource<Integer,Item>{
    public static final int PAGE_SIZE=20;
    private static final int FIRST_PAGE=1;
    private static final String ORDER="desc";
    private static final String SORT="activity";
    private static final String SITE_NAME="stackoverflow";

    /*@Query("page") int page,
    @Query("pagesize") int pagesize,
    @Query("order") String order,
    @Query("sort") String sort,
    @Query("site") String site*/



    @Override
    public void loadInitial(@NonNull LoadInitialParams<Integer> params, @NonNull LoadInitialCallback<Integer, Item> callback) {
        ARetrofitClient.getInstance()
                .getApi()
                .getAnswers(FIRST_PAGE,PAGE_SIZE,ORDER,SORT,SITE_NAME).enqueue(new Callback<StackResponse>() {
            @Override
            public void onResponse(Call<StackResponse> call, Response<StackResponse> response) {

                if(response.body()!=null){
                    callback.onResult(response.body().items,null,FIRST_PAGE+1);
                }
            }

            @Override
            public void onFailure(Call<StackResponse> call, Throwable t) {

            }
        });
    }

    @Override
    public void loadBefore(@NonNull LoadParams<Integer> params, @NonNull LoadCallback<Integer, Item> callback) {

        ARetrofitClient.getInstance().getApi().getAnswers(params.key,PAGE_SIZE,ORDER,SORT,SITE_NAME).enqueue(new Callback<StackResponse>() {
            @Override
            public void onResponse(Call<StackResponse> call, Response<StackResponse> response) {

                if(response.body()!=null){
                    Integer key = params.key>1? params.key-1:null;
                    callback.onResult(response.body().items,key);
                }
            }

            @Override
            public void onFailure(Call<StackResponse> call, Throwable t) {

            }
        });
    }

    @Override
    public void loadAfter(@NonNull LoadParams<Integer> params, @NonNull LoadCallback<Integer, Item> callback) {
        ARetrofitClient.getInstance().getApi().getAnswers(params.key,PAGE_SIZE,ORDER,SORT,SITE_NAME).enqueue(new Callback<StackResponse>() {
            @Override
            public void onResponse(Call<StackResponse> call, Response<StackResponse> response) {
                if(response.body()!=null){
                    Integer key = response.body().has_more? params.key+1:null;
                    callback.onResult(response.body().items,key);
                }
            }

            @Override
            public void onFailure(Call<StackResponse> call, Throwable t) {

            }
        });
    }
}
