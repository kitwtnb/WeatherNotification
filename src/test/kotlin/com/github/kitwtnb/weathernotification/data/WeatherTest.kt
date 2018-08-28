package com.github.kitwtnb.weathernotification.data

import com.github.kitwtnb.weathernotification.data.WeatherTest.moshi
import com.github.kitwtnb.weathernotification.di.jsonMapperModule
import com.squareup.moshi.Moshi
import io.kotlintest.fail
import io.kotlintest.shouldBe
import io.kotlintest.shouldNotBe
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import org.jetbrains.spek.api.dsl.on
import org.koin.standalone.KoinComponent
import org.koin.standalone.StandAloneContext.startKoin
import org.koin.standalone.inject
import testJson

object WeatherTest: Spek({
    val jsonAdapter = moshi.adapter(Weather::class.java)

    describe("Weather class") {
        on("convert from json") {
            it("is success") {
                jsonAdapter.fromJson(testJson) shouldNotBe null
            }
        }

        on("succeed convert from json") {
            val weather = jsonAdapter.fromJson(testJson) ?: fail("return null")
            it("is same json") {
                weather.run {
                    location.run {
                        area shouldBe "関東"
                        prefecture shouldBe "東京都"
                        city shouldBe "東京"
                    }
                    title shouldBe "東京都 東京 の天気"
                    link shouldBe "http://weather.livedoor.com/area/forecast/130010"
                    publicTime shouldBe "2018-08-26T11:00:00+0900"
                    description.run {
                        text shouldBe " 関東甲信地方は高気圧に覆われていますが、日本海から東北地方にのびる\n前線に向かって暖かく湿った空気が流れ込んでいます。\n\n【関東甲信地方】\n 関東甲信地方は晴れや曇りとなっています。\n\n 26日は、高気圧に覆われておおむね晴れますが、湿った空気の影響で、\n山沿いを中心に曇りや雨となり、雷を伴って激しく降る所があるでしょう。\n\n 27日は、はじめ高気圧に覆われておおむね晴れますが、前線が南下する\nため、次第に曇りや雨となり、雷を伴って激しく降る所がある見込みです。\n\n 関東近海では、27日にかけてうねりを伴い波がやや高いでしょう。\n\n【東京地方】\n 26日は、晴れで夕方から曇るでしょう。夕方から夜のはじめ頃にかけて\n雨や雷雨となる所がある見込みです。\n 27日は、晴れで夕方から曇るでしょう。夕方から夜のはじめ頃にかけて\n雨や雷雨となり、激しく降る所がある見込みです。\n 東京都では27日にかけて高温が予想され、熱中症の危険が特に高くなる\n見込みです。暑さを避け、水分をこまめに補給するなど、十分な対策をとっ\nてください。"
                        publicTime shouldBe "2018-08-26T10:38:00+0900"
                    }
                    forecasts.size shouldBe 3
                    forecasts[1].run {
                        date shouldBe "2018-08-27"
                        dateLabel shouldBe "明日"
                        telop shouldBe "晴のち曇"
                        image.run {
                            title shouldBe "晴のち曇"
                            url shouldBe "http://weather.livedoor.com/img/icon/5.gif"
                            width shouldBe 50
                            height shouldBe 31
                        }
                        temperature.run {
                            val nonNullMin = min ?: fail("min is null")
                            nonNullMin.run {
                                celsius shouldBe 26
                                fahrenheit shouldBe 78.8
                            }
                            val nonNullMax = max ?: fail("min is null")
                            nonNullMax.run {
                                celsius shouldBe 36
                                fahrenheit shouldBe 96.8
                            }
                        }
                        pinpointLocations.size shouldBe 53
                        pinpointLocations[0].run {
                            link shouldBe "http://weather.livedoor.com/area/forecast/1310100"
                            name shouldBe "千代田区"
                        }
                        copyright.run {
                            title shouldBe "(C) LINE Corporation"
                            link shouldBe "http://weather.livedoor.com/"
                            image.run {
                                title shouldBe "livedoor 天気情報"
                                link shouldBe "http://weather.livedoor.com/"
                                url shouldBe "http://weather.livedoor.com/img/cmn/livedoor.gif"
                                width shouldBe 118
                                height shouldBe 26
                            }
                            provider.size shouldBe 1
                            provider[0].run {
                                link shouldBe "http://tenki.jp/"
                                name shouldBe "日本気象協会"
                            }
                        }
                    }
                }
            }
        }
    }
}), KoinComponent {
    // FIXME: I don't know the right way for using di...
    val moshi: Moshi by inject()

    init {
        startKoin(listOf(jsonMapperModule))
    }
}
