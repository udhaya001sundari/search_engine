package com.example.search.controller;

import com.example.search.entity.ProductExtension;
import com.example.search.service.ProductExtensionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/product-extensions")
public class ProductExtensionController {

    @Autowired
    private ProductExtensionService productExtensionService;

    @GetMapping
    public ResponseEntity<List<ProductExtension>> getAllProductExtensions() {
        List<ProductExtension> productExtensions = productExtensionService.getAllProductExtensions();
        return new ResponseEntity<>(productExtensions, HttpStatus.OK);
    }

    @GetMapping("/search")
    public ResponseEntity<ProductExtension> getProductExtensionById(@RequestParam Long id) {
        ProductExtension productExtension = productExtensionService.getProductExtensionById(id);
        if (productExtension != null) {
            return new ResponseEntity<>(productExtension, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
