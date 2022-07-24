package com.example.shop.infrastructure.repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.shop.core.entities.product;

public interface ProductRepository extends CrudRepository<Product, Integer> {

}