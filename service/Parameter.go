package service

type Parameter struct {
	Weathers []Weather `json:"weathers"`
	Slack    Slack     `json:"slack"`
}
