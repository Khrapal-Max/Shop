package com.example.shop.infrastructure.Repositories;

import com.example.shop.core.entities.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, Integer> {
}