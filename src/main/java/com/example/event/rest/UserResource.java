package com.example.event.rest;

import com.example.event.publisher.NotificationPublisher;
import com.example.event.publisher.SubscriberPublisher;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class UserResource {

    NotificationPublisher notificationPublisher;
    SubscriberPublisher subscriberPublisher;

    @GetMapping
    public String addUser(){
        return notificationPublisher.startPushNotification("User added");
    }

    @GetMapping("/sub")
    public String addSub(){
        return subscriberPublisher.startPushSubscriber("mohamed ali");
    }


}
