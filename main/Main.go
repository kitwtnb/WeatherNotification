package main

import (
	"encoding/json"
	. "fmt"
	"github.com/kitwtnb/WeatherNotification/service"
)

func main() {
	jsonStr := `{
	"weathers": [
		{
			"city_code": "016010",
			"description": "sapporo"
		}
	],
	"slack": {
		"web_hook_url": "your slack webhook url"
	}
}`
	var param service.Parameter

	bytes := []byte(jsonStr)
	err := json.Unmarshal(bytes, &param)
	if err != nil {
		Println("error: ", err)
		return
	}

	service := new(service.WeatherNotificationService)
	err = service.Run(param)
	if err != nil {
		Println("error: ", err)
		return
	}
}
