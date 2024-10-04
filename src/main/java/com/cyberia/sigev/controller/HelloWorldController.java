package com.cyberia.sigev.controller;

import com.cyberia.sigev.controller.dto.GreeterResponse;
import com.cyberia.sigev.controller.dto.HelloWorldResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/hello-world")
    public HelloWorldResponse helloWorld() {
        return new HelloWorldResponse("Hello World!");
    }

    @GetMapping("/greet")
    public GreeterResponse greeter(@RequestParam String name) {
        return new GreeterResponse("Hello " + name);
    }
}
