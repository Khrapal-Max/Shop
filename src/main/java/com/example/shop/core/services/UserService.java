package com.example.shop.core.services;

import com.example.shop.core.entities.Product;
import com.example.shop.core.entities.User;
import com.example.shop.infrastructure.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public List<Product> getAllUserProducts(int id) {
        return userRepository.findById(id).get().getProducts();
    }
}
