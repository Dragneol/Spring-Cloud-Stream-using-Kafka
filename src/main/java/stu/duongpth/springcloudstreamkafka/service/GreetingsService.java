package stu.duongpth.springcloudstreamkafka.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;
import org.springframework.util.MimeTypeUtils;
import stu.duongpth.springcloudstreamkafka.message.Greetings;
import stu.duongpth.springcloudstreamkafka.stream.GreetingsStreams;

@Service
public class GreetingsService {

    @Autowired
    GreetingsStreams greetingsStreams;

    public void sendGreeting(final Greetings greetings) {

        MessageChannel messageChannel = greetingsStreams.outboundGreetings();
        messageChannel.send(MessageBuilder
                .withPayload(greetings)
                .setHeader(MessageHeaders.CONTENT_TYPE, MimeTypeUtils.APPLICATION_JSON)
                .build());
    }
}
