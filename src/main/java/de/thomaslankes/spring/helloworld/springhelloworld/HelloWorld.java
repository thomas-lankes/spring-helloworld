package de.thomaslankes.spring.helloworld.springhelloworld;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

    @GetMapping("/helloworld")
    public String index() {
        return "Greetings from Spring Boot!";
    }

}
