package com.example.search.service;

import com.example.search.entity.ProductExtension;
import com.example.search.repository.ProductExtensionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductExtensionService {

    @Autowired
    private ProductExtensionRepository productExtensionRepository;

    public List<ProductExtension> getAllProductExtensions() {
        return productExtensionRepository.findAll();
    }

    public ProductExtension getProductExtensionById(Long id) {
        return productExtensionRepository.findById(id).orElse(null);
    }
}

