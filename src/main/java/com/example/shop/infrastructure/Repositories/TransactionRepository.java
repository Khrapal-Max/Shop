package com.example.shop.infrastructure.repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.shop.core.entities.transaction;

public interface TransactionRepository extends CrudRepository<Transaction, Integer> {

}