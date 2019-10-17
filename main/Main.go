package main

import (
	"encoding/json"
	. "fmt"
	. "github.com/kitwtnb/WeatherNotification/data"
	"github.com/kitwtnb/WeatherNotification/weather"
	"strings"
)

func main() {
	jsonStr := `{
	"slack": {
		"web_hook_url": "https://hooks.slack.com/services/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"
	}
}`
	var param Parameter

	bytes := []byte(jsonStr)
	err := json.Unmarshal(bytes, &param)
	if err != nil {
		Println("error: ", err)
		return
	}
	Println(param.Slack.WebHookUrl)


	var weatherClient = new (weather.Client)
	info, err := weatherClient.Fetch(weather.Param { CityCode: "016010" })
	if err != nil {
		Println("error: ", err)
		return
	}

	var forecast *weather.Forecasts = nil
	for _, f := range info.Forecasts {
		if f.DateLabel == "今日" && strings.Contains(f.Telop, "雨") {
			forecast = &f
			break
		}
	}
	Println(forecast)

	//postParam := slack.Param{
	//	Text:      "<!channel>\nhello go",
	//}

	//var client = slack.Client { WebHookUrl: param.Slack.WebHookUrl }
	//statusCode, err := client.Post(postParam)
	//if err != nil {
	//	Println("error: ", err)
	//	return
	//}
	//
	//Println(statusCode)
}
