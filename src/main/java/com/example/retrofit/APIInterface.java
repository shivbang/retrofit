package com.example.retrofit;


import retrofit2.Call;
import retrofit2.http.*;
import retrofit2.Retrofit;
import java.util.*;

public interface APIInterface {
    @GET("users/{user}/repos")
    Call<List<Repo>> getData(@Path("user") String user);
}
