package com.github.kitwtnb.weathernotification.service

import com.github.kitwtnb.weathernotification.data.SlackPayload
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST
import retrofit2.http.Path

interface SlackService {
    @POST("/services/{slack_channel_key}")
    fun post(@Path(value = "slack_channel_key", encoded = true) key: String, @Body payload: SlackPayload): Call<Void>
}
