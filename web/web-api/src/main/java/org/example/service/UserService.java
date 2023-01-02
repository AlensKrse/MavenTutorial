package org.example.service;

import org.example.entities.User;

import java.util.List;

public class UserService {

    public List<User> findAll() {
        return List.of(new User(1L, "John", "Doe", "johndoe@gmail.com"), new User());
    }
}
