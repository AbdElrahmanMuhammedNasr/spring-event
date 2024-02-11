package com.example.event.publisher;

  import com.example.event.event.SubscribeEvent;
  import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class SubscriberPublisher {

    ApplicationEventPublisher applicationEventPublisher;
    public String startPushSubscriber(String message){
        applicationEventPublisher.publishEvent(new SubscribeEvent(message));
        return "Start pushing subscriber.";
    }
}
