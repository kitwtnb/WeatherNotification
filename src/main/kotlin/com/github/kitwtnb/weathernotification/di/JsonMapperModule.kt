package com.github.kitwtnb.weathernotification.di

import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import org.koin.dsl.module.Module
import org.koin.dsl.module.applicationContext

val jsonMapperModule : Module = applicationContext {
    bean { Moshi.Builder().add(KotlinJsonAdapterFactory()).build() as Moshi }
}
