package com.example.parsejsonbygson.Network;


import com.example.parsejsonbygson.Models.jsoninfo;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * API to set/get data to/from server
 */

public interface API {
    // get info
    @GET("json3.php")
    Call<jsoninfo> getJsonInfo();
}
