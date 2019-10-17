package weathernotification

import (
	"context"
	"encoding/json"
	. "github.com/kitwtnb/WeatherNotification/data"
	"log"
)

// PubSubMessage is the payload of a Pub/Sub event. Please refer to the docs for
// additional information regarding Pub/Sub events.
type PubSubMessage struct {
	Data []byte `json:"data"`
}


// HelloPubSub consumes a Pub/Sub message.
func Notification(ctx context.Context, m PubSubMessage) error {
	var i Parameter

	err := json.Unmarshal(m.Data, &i)
	if err != nil {
		log.Printf("Error:%T message: %v", err, err)
		return nil
	}

	log.Printf("your name is %s", i.Name)
	return nil
}
