package com.example.shop.infrastructure.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.shop.core.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}