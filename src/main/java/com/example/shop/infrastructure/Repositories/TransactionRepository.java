package com.example.shop.infrastructure.Repositories;

import com.example.shop.core.entities.Transaction;
import org.springframework.data.repository.CrudRepository;

public interface TransactionRepository extends CrudRepository<Transaction, Integer> {

}