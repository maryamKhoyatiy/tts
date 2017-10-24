package com.example.parsejsonbygson.Network;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * this Class for connect ot Server
 */

public class RetrofitObj {
    private static Retrofit RetrofitObj=null;
    public static void CreateRetrofitObj(){
        Retrofit retrofit=new Retrofit.Builder()
                .baseUrl(Config.getURL())
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        RetrofitObj=retrofit;
    }
    public static Retrofit getRetrofitObj() {
        return RetrofitObj;
    }
}
