package com.example.retrofit;

import retrofit2.Callback;
import retrofit2.Call;
import retrofit2.Response;
import java.util.*;


public class APICallback implements Callback<List<Repo>> {

    @Override
    public void onResponse(Call<List<Repo>> call, Response<List<Repo>> response){
        if(response.isSuccessful()){
            List<Repo> res = response.body();
            for(Repo rep: res){
                System.out.println(rep.getId());
            }
        }
        else {
            String error = response.errorBody().toString();
            System.out.println(error);

        }
    }
    @Override
    public void onFailure(Call<List<Repo>> call, Throwable t){
        String error = t.getMessage();
        System.out.println(error);

    }
}
