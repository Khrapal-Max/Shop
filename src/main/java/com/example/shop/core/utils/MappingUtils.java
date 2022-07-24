package com.example.shop.core.utils;

import com.example.shop.core.dto.UserDTO;
import com.example.shop.core.entities.User;
import org.springframework.stereotype.Service;

@Service
public class MappingUtils {
    public UserDTO mapToUserDto(User entity){

        UserDTO dto = new UserDTO();
        dto.setId (entity.getId());
        dto.setFirstName(entity.getFirstName());
        dto.setFirstName(entity.getLastName());
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
}
