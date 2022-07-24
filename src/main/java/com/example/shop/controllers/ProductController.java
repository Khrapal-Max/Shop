package com.example.shop.controllers;

import com.example.shop.core.entities.Product;
import com.example.shop.core.entities.User;
import com.example.shop.core.services.ProductService;
import com.example.shop.core.services.UserService;
import com.example.shop.infrastructure.Repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="api/v1/products")
public class ProductController {

    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping(path="/allProducts")
    public @ResponseBody Iterable<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    //another functions
}
