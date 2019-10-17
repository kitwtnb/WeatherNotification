package weather

import (
	"encoding/json"
	"io/ioutil"
	"net/http"
)

type Client struct {
}

const (
	baseUrl = "http://weather.livedoor.com/forecast/webservice/json/v1?city="
)

func (client *Client) Fetch(param Param) (*Info, error) {
	url := baseUrl + param.CityCode
	response, err := http.Get(url)
	if err != nil {
		return nil, err
	}

	defer response.Body.Close()
	byteArray, err := ioutil.ReadAll(response.Body)
	if err != nil {
		return nil, err
	}

	var info Info
	er := json.Unmarshal(byteArray, &info)
	if er != nil {
		return nil, err
	}

	return &info, nil
}