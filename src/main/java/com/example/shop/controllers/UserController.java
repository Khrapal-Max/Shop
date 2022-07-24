package com.example.shop.controllers;

import com.example.shop.core.dto.UserDTO;
import com.example.shop.core.entities.Product;
import com.example.shop.core.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path="api/v1/users")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping(path = "/allUsers")
    public @ResponseBody Iterable<UserDTO> getAllUser() {
        return userService.getAllUsers();
    }

    @GetMapping(path = "/products/{id}")
    public @ResponseBody Iterable<Product> getAllUserProducts(@PathVariable int id) {
        return userService.getAllUserProducts(id);
    }

    //another functions
}


