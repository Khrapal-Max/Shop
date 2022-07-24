package com.example.shop.core.services;

import com.example.shop.core.dto.TransactionDTO;
import com.example.shop.core.entities.Transaction;
import com.example.shop.core.utils.MappingUtils;
import com.example.shop.infrastructure.Repositories.ProductRepository;
import com.example.shop.infrastructure.Repositories.TransactionRepository;
import com.example.shop.infrastructure.Repositories.UserRepository;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransactionService {

    private final MappingUtils mappingUtils;
    private final TransactionRepository transactionRepository;
    private final UserRepository userRepository;
    private final ProductRepository productRepository;

    @Autowired
    public TransactionService(MappingUtils mappingUtils, TransactionRepository transactionRepository, UserRepository userRepository, ProductRepository productRepository) {
        this.mappingUtils = mappingUtils;
        this.transactionRepository = transactionRepository;
        this.userRepository = userRepository;
        this.productRepository = productRepository;
    }

    public Boolean makePurchase(@NotNull TransactionDTO transactionDTO) {
        var userAmount = userRepository.findById(transactionDTO.getUserId()).get().getAmountOfMoney();
        var productPrice = productRepository.findById(transactionDTO.getProductId()).get().getPrice();

        if (userAmount < productPrice) {
            return false;
        }

        var purchase = new Transaction(transactionDTO.getUserId(), transactionDTO.getProductId());

        transactionRepository.save(purchase);
        var updateAmount = userAmount - productPrice;
        userRepository.findById(transactionDTO.getUserId())
                .map(user -> {
                    user.setAmountOfMoney(updateAmount);
                    return userRepository.save(user);
                });
        return true;
    }
}
