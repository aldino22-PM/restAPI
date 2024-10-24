package com.example.mahasiswa_restapi.service;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class apiclient {


    public static Retrofit retrofit;
    public static final String BASE_URL = "https://mobileapi.pekanbaru.go.id";


    public static Retrofit getRetrofitInstance(){
        if (retrofit == null){
            retrofit = new retrofit2.Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }


}
