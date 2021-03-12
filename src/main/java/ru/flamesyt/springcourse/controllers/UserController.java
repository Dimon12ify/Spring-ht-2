package ru.flamesyt.springcourse.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.flamesyt.springcourse.entity.UserEntity;
import ru.flamesyt.springcourse.services.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/hello")
    public String example() {
        return "Hello, world!";
    }

    @GetMapping("")
    public Iterable<UserEntity> getAllUsers() {
        return userService.getAllusers();
    }
}
