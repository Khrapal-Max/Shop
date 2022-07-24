package com.example.shop.core.utils;

import com.example.shop.core.dto.ProductDTO;
import com.example.shop.core.dto.TransactionDTO;
import com.example.shop.core.dto.UserDTO;
import com.example.shop.core.entities.Product;
import com.example.shop.core.entities.Transaction;
import com.example.shop.core.entities.User;
import org.springframework.stereotype.Service;

@Service
public class MappingUtils {

    public UserDTO mapToUserDto(User entity){

        UserDTO dto = new UserDTO();
        dto.setId (entity.getId());
        dto.setFirstName(entity.getFirstName());
        dto.setLastName(entity.getLastName());
        dto.setAmountOfMoney(entity.getAmountOfMoney());
        return dto;
    }

    public User mapToUserEntity(UserDTO dto){
        User entity = new User();
        entity.setId(dto.getId());
        entity.setFirstName(dto.getFirstName());
        entity.setLastName(dto.getLastName());
        entity.setAmountOfMoney(dto.getAmountOfMoney());
        return entity;
    }

    public ProductDTO mapToProductDto(Product entity){

        ProductDTO dto = new ProductDTO();
        dto.setId (entity.getId());
        dto.setName(entity.getName());
        dto.setPrice(entity.getPrice());
        return dto;
    }

    public Product mapToProductEntity(ProductDTO dto){
        Product entity = new Product();
        entity.setId(dto.getId());
        entity.setName(entity.getName());
        entity.setPrice(entity.getPrice());
        return entity;
    }

    public TransactionDTO mapToTransactionDto(Transaction entity){

        TransactionDTO dto = new TransactionDTO();
        dto.setId (entity.getId());
        dto.setUserId(entity.getUserId());
        dto.setProductId(entity.getProductId());
        return dto;
    }

    public Transaction mapToTransactionEntity(TransactionDTO dto){
        Transaction entity = new Transaction();
        entity.setUserId(entity.getUserId());
        entity.setProductId(entity.getProductId());
        return entity;
    }
}
