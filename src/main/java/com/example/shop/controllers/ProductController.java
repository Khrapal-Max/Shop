package com.example.shop.controllers;

import com.example.shop.core.dto.ProductDTO;
import com.example.shop.core.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path="api/v1/products")
public class ProductController {

    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping(path="/allProducts")
    public @ResponseBody Iterable<ProductDTO> getAllProducts() {
        return productService.getAllProducts();
    }

    //another functions
}
