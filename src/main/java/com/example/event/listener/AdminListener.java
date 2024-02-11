package com.example.event.listener;

import com.example.event.event.SubscribeEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class AdminListener {

    @EventListener
//    @EventListener(classes = {SubscribeEvent.class , Tamer.class})
    public void onEvent(SubscribeEvent event) {
        System.out.println("start Admin  listener to event");
        System.out.println("Admin listener received "+event.getUserName());
        System.out.println("end Admin listener to event");
    }

}
