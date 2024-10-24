package com.example.mahasiswa_restapi.service;

import com.example.mahasiswa_restapi.model.mahasiswa;


import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;


public interface apiservice {


    @GET("posts/{id}")
    Call<mahasiswa> getMahasiswa(@Path("id") int postId);
    @POST("mahasiswa")
    Call<mahasiswa> createMahasiswa(@Body mahasiswa post);
}

