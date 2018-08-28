package com.github.kitwtnb.weathernotification

import com.github.kitwtnb.weathernotification.data.SlackPayload
import com.github.kitwtnb.weathernotification.data.Weather

fun weatherToSlackPayload(weather: Weather): SlackPayload {
    val text = weather.run {
        """
           | 今日の${location.city}の天気は${forecasts.first { it.dateLabel == "今日" }.telop}です。
           |
           |${description.text}
        """.trimMargin()
    }

    return SlackPayload(text)
}
