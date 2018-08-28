package com.github.kitwtnb.weathernotification

import com.github.kitwtnb.weathernotification.service.SlackService
import com.github.kitwtnb.weathernotification.service.WeatherService
import org.koin.standalone.KoinComponent
import org.koin.standalone.inject

class WeatherNotification : KoinComponent {
    private val weatherService: WeatherService by inject()
    private val slackService: SlackService by inject()

    fun run(cityCode: String, slackChannelKey: String) {
        weatherService.getWeather(cityCode).execute().body()?.let {
            slackService.post(slackChannelKey, weatherToSlackPayload(it)).execute()
        }
    }
}
