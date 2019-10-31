package com.example.retrofityoutube.retrofit;

import com.example.retrofityoutube.model.VideoModel;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface NetworkInterface {

//    @GET("/api/docs")
//    Call<ArrayList<VideoModel>>GetVideo(@Query("title")String title,@Query("id") Integer id,@Query("publisher")String publisher,@Query("thumbnail")String thumbnail
//            ,@Query("viewCount")String viewCount, @Query("embedHtml")String embedHtml);

    @GET("/api/videos/")
    Call<ArrayList<VideoModel>>GetVideo();


//    @POST("/api/videos/")
//    Call<ArrayList<VideoModel>>GetVideo(@Query("title")String title,@Query("id") Integer id,@Query("publisher")String publisher,@Query("thumbnail")String thumbnail
//            ,@Query("viewCount")String viewCount, @Query("embedHtml")String embedHtml);


  //  @GET("/api/videos/get_tags")
//    Call<ArrayList<VideoModel>>GetVideo(@Query("thumbnail")String thumbnail
//          );


   // @GET("/api/videos/{id}")




}
