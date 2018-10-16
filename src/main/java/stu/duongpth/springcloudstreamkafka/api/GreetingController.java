package stu.duongpth.springcloudstreamkafka.api;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import stu.duongpth.springcloudstreamkafka.message.Greetings;
import stu.duongpth.springcloudstreamkafka.service.GreetingsService;

@RestController
public class GreetingController {

    private final GreetingsService greetingsService;

    public GreetingController(GreetingsService greetingsService) {
        this.greetingsService = greetingsService;
    }

    @GetMapping(value = "/greetings")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void greetings(@RequestParam("msg") String msg) {
        Greetings greetings = new Greetings(msg);
        greetingsService.sendGreeting(greetings);
    }
}
