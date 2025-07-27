package com.scaler.productservicedecmwfeve.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// This class will ahve multiple methods
// that will be serving HTTP Requests at /hello
// This class will be service Rest (HTTP) APIS
// localhost:8080/hello
@RestController
@RequestMapping("/hello")
public class HelloController {

    // GET /hello/say
    @GetMapping("/say/{name}/{times}")
    public String sayHello(@PathVariable String name,
                           @PathVariable int times) {
        String answer = "";

        for (int i = 0; i < times; ++i) {
            answer += "Hello " + name;
            answer += "\n";
        }

        return answer;
    }
    // Something in curly braces becomes a variables
}
