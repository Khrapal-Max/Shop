package com.example.shop.controllers;

import com.example.shop.core.entities.User;
import com.example.shop.core.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="api/v1/users")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping(path = "/allUsers")
    public @ResponseBody Iterable<User> getAllUser() {
        return userService.getAllUsers();
    }

    //another functions
}


