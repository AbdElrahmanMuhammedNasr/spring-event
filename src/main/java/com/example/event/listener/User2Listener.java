package com.example.event.listener;

import com.example.event.event.NotificationEvent;
import org.springframework.context.event.EventListener;
import org.springframework.core.annotation.Order;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class User2Listener {

    @Async
    @Order(20)
    @EventListener
    public void listenToNotification(NotificationEvent event) throws InterruptedException {
        Thread.sleep(5000);
        System.out.println("start user 2 listener to event");
        for (int i = 0; i < 10; i++) {
            Thread.sleep(1000);
            System.out.println("user 2 listener received "+i+"   "+event.getMessage());
        }
        System.out.println("end user 2 listener to event");
    }


}
