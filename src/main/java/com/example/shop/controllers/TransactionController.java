package com.example.shop.controllers;

import com.example.shop.core.dto.TransactionDTO;
import com.example.shop.core.services.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path="api/v1/transactions")
public class TransactionController {
    private final TransactionService transactionService;

    @Autowired
    public TransactionController(TransactionService transactionService) {
        this.transactionService = transactionService;
    }

    @PostMapping(path = "/purchase")
    public @ResponseBody Boolean makePurchase(@RequestBody TransactionDTO transactionDTO) {
        return transactionService.makePurchase(transactionDTO);
    }
}
