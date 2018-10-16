package stu.duongpth.springcloudstreamkafka.config;

import org.springframework.cloud.stream.annotation.EnableBinding;
import stu.duongpth.springcloudstreamkafka.stream.GreetingsStreams;

@EnableBinding(GreetingsStreams.class)
public class StreamConfig {
}
