package com.example.shop.core.services;

import com.example.shop.core.dto.ProductDTO;
import com.example.shop.core.utils.MappingUtils;
import com.example.shop.infrastructure.Repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    private final MappingUtils mappingUtils;

    @Autowired
    public ProductService(ProductRepository productRepository, MappingUtils mappingUtils) {
        this.productRepository = productRepository;
        this.mappingUtils = mappingUtils;
    }

    public List<ProductDTO> getAllProducts() {
        return productRepository.findAll().stream()
                .map(mappingUtils::mapToProductDto)
                .collect(Collectors.toList());
    }
}
