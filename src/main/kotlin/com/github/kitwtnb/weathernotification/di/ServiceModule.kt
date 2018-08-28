package com.github.kitwtnb.weathernotification.di

import com.github.kitwtnb.weathernotification.service.SlackService
import com.github.kitwtnb.weathernotification.service.WeatherService
import org.koin.dsl.module.Module
import org.koin.dsl.module.applicationContext
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

val serviceModule : Module = applicationContext {
    bean { Retrofit.Builder()
            .baseUrl("http://weather.livedoor.com")
            .addConverterFactory(MoshiConverterFactory.create(get()))
            .build()
            .create(WeatherService::class.java)as WeatherService }

    bean { Retrofit.Builder()
            .baseUrl("https://hooks.slack.com")
            .addConverterFactory(MoshiConverterFactory.create(get()))
            .build()
            .create(SlackService::class.java)as SlackService }
}
