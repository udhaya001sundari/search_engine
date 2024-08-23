
package com.example.search.service;

import com.example.search.entity.Product;
import com.example.search.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public Product searchById(Long id) {
        Optional<Product> product = productRepository.findById(id);
        return product.orElse(null); // Returns the product if found, otherwise null
    }


    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }
}
