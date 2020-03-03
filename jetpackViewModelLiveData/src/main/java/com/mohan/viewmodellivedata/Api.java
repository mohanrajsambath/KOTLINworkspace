package com.mohan.viewmodellivedata;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface Api {
    @GET("answers")
    Call<StackResponse> getAnswers(
            @Query("page") int page,
            @Query("pagesize") int pagesize,
            @Query("order") String order,
            @Query("sort") String sort,
            @Query("site") String site
    );
}
