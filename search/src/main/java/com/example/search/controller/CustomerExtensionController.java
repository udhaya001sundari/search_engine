package com.example.search.controller;

import com.example.search.entity.CustomerExtension;
import com.example.search.service.CustomerExtensionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/customer-extensions")
public class CustomerExtensionController {

    @Autowired
    private CustomerExtensionService customerExtensionService;

    @GetMapping
    public ResponseEntity<List<CustomerExtension>> getAllCustomerExtensions() {
        List<CustomerExtension> customerExtensions = customerExtensionService.getAllCustomerExtensions();
        return new ResponseEntity<>(customerExtensions, HttpStatus.OK);
    }

    @GetMapping("/search")
    public ResponseEntity<CustomerExtension> getCustomerExtensionById(@RequestParam Long id) {
        CustomerExtension customerExtension = customerExtensionService.getCustomerExtensionById(id);
        if (customerExtension != null) {
            return new ResponseEntity<>(customerExtension, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
