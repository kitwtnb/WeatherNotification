package slack

import (
	"bytes"
	"encoding/json"
	"fmt"
	"net/http"
)

type Client struct {
	WebHookUrl string
}

func (client *Client) Post(param Param) (int, error) {
	jsonData, err := json.Marshal(param)
	if err != nil {
		return -1, err
	}

	jsonString := string(jsonData)
	request, err := http.NewRequest(
		"POST",
		client.WebHookUrl,
		bytes.NewBuffer([]byte(jsonString)),
	)
	if err != nil {
		return -1, err
	}

	request.Header.Set("Content-Type", "application/json")
	httpClient := &http.Client{}
	response, err := httpClient.Do(request)
	if err != nil {
		fmt.Print(err)
	}

	return response.StatusCode, nil
}
