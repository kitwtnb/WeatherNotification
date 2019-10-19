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
	Data []byte `json:"data"`
}

// HelloPubSub consumes a Pub/Sub message.
func Notification(ctx context.Context, m PubSubMessage) error {
	log.Println("Notification is running")
	log.Println("Input Json: ", string(m.Data))

	var param service.Parameter
	err := json.Unmarshal(m.Data, &param)
	if err != nil {
		log.Printf("json parse error:%T message: %v json: %s", err, err, string(m.Data))
		return err
	}

	service := new(service.WeatherNotificationService)
	err = service.Run(param)
	if err != nil {
		log.Println("error: ", err)
		return err
	}

	log.Println("Notification is finish")

	return nil
}
