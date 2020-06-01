package com.example.recyclerviewdemo.Rest

import com.example.recyclerviewdemo.model.WeatherData
import retrofit2.Call
import retrofit2.http.GET

interface ApiInterface {

@GET(value="weather?q=Pune&appid=7fa83349f35e368771d161b69e02c48e&units=metric")
fun getWeatherData(): Call<WeatherData>

}