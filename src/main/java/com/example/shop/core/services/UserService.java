package com.example.shop.core.services;

import com.example.shop.core.dto.ProductDTO;
import com.example.shop.core.dto.UserDTO;
import com.example.shop.core.utils.MappingUtils;
import com.example.shop.infrastructure.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {

    private final UserRepository userRepository;

    private final MappingUtils mappingUtils;

    @Autowired
    public UserService(UserRepository userRepository, MappingUtils mappingUtils) {
        this.userRepository = userRepository;
        this.mappingUtils = mappingUtils;
    }

    public List<UserDTO> getAllUsers() {

        return userRepository.findAll().stream()
                .map(mappingUtils::mapToUserDto)
                .collect(Collectors.toList());
    }

    public List<ProductDTO> getAllUserProducts(int id) {

        return userRepository.findById(id).get().getProducts().stream()
                .map(mappingUtils::mapToProductDto)
                .collect(Collectors.toList());
    }
}
