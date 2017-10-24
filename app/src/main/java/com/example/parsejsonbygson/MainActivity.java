package com.example.parsejsonbygson;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;


import com.example.parsejsonbygson.Adapters.jsonInfoAdpter;
import com.example.parsejsonbygson.Models.jsoninfo;
import com.example.parsejsonbygson.Network.API;
import com.example.parsejsonbygson.Network.RetrofitObj;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;
    private jsonInfoAdpter adapter;




    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // create RecyclerView
        recyclerView=(RecyclerView)findViewById(R.id.recycleview);
        layoutManager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);

        // get Data from server
        RetrofitObj.CreateRetrofitObj();
        API instAPI = RetrofitObj.getRetrofitObj()
                .create(API.class);
        Call<jsoninfo> getJsonInfo=instAPI.getJsonInfo();
        getJsonInfo.enqueue(new CallBackJsonInfo());






    }
    // call Back for json info
    class CallBackJsonInfo implements Callback<jsoninfo> {

        @Override
        public void onResponse(Call<jsoninfo> call, retrofit2.Response<jsoninfo> response) {
            Log.d("Response","yes");
            List<jsoninfo> list = new ArrayList<>();
            list.add(response.body());
            adapter = new jsonInfoAdpter(list);
            recyclerView.setAdapter(adapter);
        }

        @Override
        public void onFailure(Call<jsoninfo> call, Throwable t) {
            Log.d("Failure","yes");
        }
    }
}
