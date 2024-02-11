package com.example.event.listener;

import com.example.event.event.NotificationEvent;
 import org.springframework.context.event.EventListener;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
public class UserListener   {

    @Order(50)
    @EventListener
    public void listenToNotification(NotificationEvent event) {
        System.out.println("start user 1  listener to event");
        System.out.println("user 1 listener received "+event.getMessage());
        System.out.println("end user 1 listener to event");
    }


}
