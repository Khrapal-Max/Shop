package com.example.shop.infrastructure.Repositories;

import com.example.shop.core.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}