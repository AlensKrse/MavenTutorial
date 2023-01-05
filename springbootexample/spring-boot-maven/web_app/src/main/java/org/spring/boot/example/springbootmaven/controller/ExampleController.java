package org.spring.boot.example.springbootmaven.controller;

import org.spring.boot.example.springbootmaven.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/example")
public class ExampleController {

    @GetMapping()
    public Map<String, Object> get() {
        return Map.of("user1", new User(1L, "John", "Doe"), "user2", new User(2L, "Foo", "Bar"));
    }
}
