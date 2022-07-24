package com.example.shop.infrastructure.Repositories;

import com.example.shop.core.entities.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {

}