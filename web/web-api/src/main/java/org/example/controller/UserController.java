package org.example.controller;


import org.example.entities.User;
import org.example.service.UserService;

import java.util.List;

public class UserController {

    private final UserService userService;

    public UserController(final UserService userService) {
        this.userService = userService;
    }

    public List<User> findAllUser() {
        return userService.findAll();
    }
}
