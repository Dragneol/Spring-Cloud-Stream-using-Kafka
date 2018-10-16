package stu.duongpth.springcloudstreamkafka.service;

import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;
import stu.duongpth.springcloudstreamkafka.message.Greetings;
import stu.duongpth.springcloudstreamkafka.stream.GreetingsStreams;

@Component
public class GreetingsListener {
    @StreamListener(GreetingsStreams.INPUT)
    public void handleGreetings(@Payload Greetings greetings) {
        System.out.println("Received : " + greetings.toString());
    }
}
