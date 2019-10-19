package service

import (
	"fmt"
	"github.com/kitwtnb/WeatherNotification/slack"
	"github.com/kitwtnb/WeatherNotification/weather"
	"strings"
)

type WeatherNotificationService struct {}

func (service *WeatherNotificationService) Run(param Parameter) error {
	weatherClient := new (weather.Client)
	slackClient := slack.Client { WebHookUrl: param.Slack.WebHookUrl }

	for _, w := range param.Weathers {
		info, err := weatherClient.Fetch(weather.Param { CityCode: w.CityCode })
		if err != nil {
			return err
		}

		var forecast *weather.Forecasts = nil
		for _, f := range info.Forecasts {
			if f.DateLabel == "今日" && strings.Contains(f.Telop, "雨") {
				forecast = &f
				break
			}
		}

		if forecast != nil {
			template := "<!channel>\n今日の%sの天気は%sです。\n%s"
			text := fmt.Sprintf(template, info.Location.City, forecast.Telop, info.Description)
			_, err = slackClient.Post(slack.Param { Text: text })
			if err != nil {
				return err
			}
		}
	}

	return nil
}
