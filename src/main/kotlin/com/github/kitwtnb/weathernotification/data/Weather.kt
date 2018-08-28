package com.github.kitwtnb.weathernotification.data

data class Weather(
        val location: Location,
        val title: String,
        val link: String,
        val publicTime: String,
        val description: Description,
        val forecasts: List<Forecast>,
        val pinpointLocations: List<PinpointLocation>,
        val copyright: Copyright
)

data class Location(
        val area: String,
        val prefecture: String,
        val city: String
)

data class Description(
        val text: String,
        val publicTime: String
)

data class Forecast(
        val date: String,
        val dateLabel: String,
        val telop: String,
        val image: ForecastImage,
        val temperature: Temperature
)

data class ForecastImage(
        val title: String,
        val url: String,
        val width: Int,
        val height: Int
)

data class Temperature(
        val min: TemperatureInfo?,
        val max: TemperatureInfo?
)

data class TemperatureInfo(
        val celsius: Int,
        val fahrenheit: Double
)

data class PinpointLocation(
        val link: String,
        val name: String
)

data class Copyright(
        val title: String,
        val link: String,
        val image: CopyrightImage,
        val provider: List<Provider>
)

data class CopyrightImage(
        val title: String,
        val link: String,
        val url: String,
        val width: Int,
        val height: Int
)

data class Provider(
        val link: String,
        val name: String
)
