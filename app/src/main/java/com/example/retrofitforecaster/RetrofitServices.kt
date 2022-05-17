package com.example.retrofitforecaster

import retrofit2.Call
import retrofit2.http.*
interface RetrofitServices {
    @GET("forecast?q=Shklov&appid=41c149f1a564cc03c2e5d48932318ca8&units=metric&lang=ru")
    fun getWeatherList(): Call<DataWeather>
}