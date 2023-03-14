package com.example.retrofit;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import java.util.*;

public class APICaller {
    public static void main(String[] args){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.github.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        APIInterface apiInterface = retrofit.create(APIInterface.class);
        Call<List<Repo>> call= apiInterface.getData("octocat");
        call.enqueue(new APICallback());
    }
}
