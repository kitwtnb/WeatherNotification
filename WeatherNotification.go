package weathernotification

import (
	"context"
	"encoding/json"
	"github.com/kitwtnb/WeatherNotification/service"
	"log"
)

// PubSubMessage is the payload of a Pub/Sub event. Please refer to the docs for
// additional information regarding Pub/Sub events.
type PubSubMessage struct {
	Data []byte `json:"input"`
}

// HelloPubSub consumes a Pub/Sub message.
func Notification(ctx context.Context, m PubSubMessage) error {
	var param service.Parameter
	err := json.Unmarshal(m.Data, &param)
	if err != nil {
		log.Printf("Error:%T message: %v", err, err)
		return err
	}

	service := new(service.WeatherNotificationService)
	err = service.Run(param)
	if err != nil {
		log.Println("error: ", err)
		return err
	}

	return nil
}
