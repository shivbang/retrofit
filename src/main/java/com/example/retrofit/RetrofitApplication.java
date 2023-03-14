package com.example.retrofit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@SpringBootApplication
public class RetrofitApplication {

    public static void main(String[] args) {

        SpringApplication.run(RetrofitApplication.class, args);
        new APICaller();

    }
}
