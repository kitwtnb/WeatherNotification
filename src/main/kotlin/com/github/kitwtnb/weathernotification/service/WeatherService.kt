package com.github.kitwtnb.weathernotification.service

import com.github.kitwtnb.weathernotification.data.Weather
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherService {
    @GET("/forecast/webservice/json/v1")
    fun getWeather(@Query("city") city: String): Call<Weather>
}
