package mohan.com.dikoin.data.repository

import mohan.com.dikoin.data.model.MovieApiResponseModel
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query
import java.util.*

interface RetrofitInterface {

   @GET("movie/now_playing?")
   fun getMovieList(@Query("api_key")mApi_key:String, @Query("language")mLanguage:String,
                    @Query("page")mPage:Int) : Observable<Response<MovieApiResponseModel>>

    @GET ("search/movie?")
    fun searchMovieName(@Query("api_key")mApi_key:String,
                        @Query("language")mLanguage:String,
                        @Query("query")mquery:String,@Query("page")mPage:Int): Observable<Response<MovieApiResponseModel>>



}