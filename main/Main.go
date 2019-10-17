package main

import (
	"encoding/json"
	. "fmt"
	. "github.com/kitwtnb/WeatherNotification/data"
	"github.com/kitwtnb/WeatherNotification/slack"
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

	postParam := slack.Param{
		Text:      "<!channel>\nhello go",
	}

	var client = slack.Client { WebHookUrl: param.Slack.WebHookUrl }
	statusCode, err := client.Post(postParam)
	if err != nil {
		Println("error: ", err)
		return
	}

	Println(statusCode)
}
