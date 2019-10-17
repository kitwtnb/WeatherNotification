package weather

type Info struct {
	PinpointLocations []PinpointLocations `json:"pinpointLocations"`
	Link              string              `json:"link"`
	Forecasts         []Forecasts         `json:"forecasts"`
	Location          Location            `json:"location"`
	PublicTime        string              `json:"publicTime"`
	Copyright         Copyright           `json:"copyright"`
	Title             string              `json:"title"`
	Description       Description         `json:"description"`
}
type PinpointLocations struct {
	Link string `json:"link"`
	Name string `json:"name"`
}
type Min struct {
	Celsius    string `json:"celsius"`
	Fahrenheit string `json:"fahrenheit"`
}
type Max struct {
	Celsius    string `json:"celsius"`
	Fahrenheit string `json:"fahrenheit"`
}
type Temperature struct {
	Min Min `json:"min"`
	Max Max `json:"max"`
}
type Forecasts struct {
	DateLabel   string      `json:"dateLabel"`
	Telop       string      `json:"telop"`
	Date        string      `json:"date"`
	Temperature Temperature `json:"temperature"`
	Image       Image       `json:"image"`
}
type Location struct {
	City       string `json:"city"`
	Area       string `json:"area"`
	Prefecture string `json:"prefecture"`
}
type Provider struct {
	Link string `json:"link"`
	Name string `json:"name"`
}
type Image struct {
	Width  int    `json:"width"`
	Link   string `json:"link"`
	URL    string `json:"url"`
	Title  string `json:"title"`
	Height int    `json:"height"`
}
type Copyright struct {
	Provider []Provider `json:"provider"`
	Link     string     `json:"link"`
	Title    string     `json:"title"`
	Image    Image      `json:"image"`
}
type Description struct {
	Text       string `json:"text"`
	PublicTime string `json:"publicTime"`
}
