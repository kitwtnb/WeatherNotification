package com.github.kitwtnb.weathernotification

import com.amazonaws.services.lambda.runtime.Context
import com.amazonaws.services.lambda.runtime.RequestStreamHandler
import com.github.kitwtnb.weathernotification.di.jsonMapperModule
import com.github.kitwtnb.weathernotification.di.serviceModule
import org.koin.standalone.StandAloneContext.loadKoinModules
import java.io.InputStream
import java.io.OutputStream

class Main : RequestStreamHandler {
    override fun handleRequest(input: InputStream, output: OutputStream, context: Context) {
        loadKoinModules(listOf(jsonMapperModule, serviceModule))

        val cityCode = System.getenv("cityCode")
        val slackChannelKey = System.getenv("slackChannelKey")

        WeatherNotification().run(cityCode, slackChannelKey)
    }
}
