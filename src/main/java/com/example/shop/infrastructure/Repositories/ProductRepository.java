package com.example.shop.infrastructure.Repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.shop.core.entities.Product;

public interface ProductRepository extends CrudRepository<Product, Integer> {

}