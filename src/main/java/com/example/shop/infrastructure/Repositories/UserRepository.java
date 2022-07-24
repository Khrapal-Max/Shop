package com.example.shop.infrastructure.repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.shop.core.entities.user;

public interface UserRepository extends CrudRepository<User, Integer> {

}