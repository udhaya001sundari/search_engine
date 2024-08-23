package com.example.search.service;

import com.example.search.entity.CustomerExtension;
import com.example.search.repository.CustomerExtensionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CustomerExtensionService {

    @Autowired
    private CustomerExtensionRepository customerExtensionRepository;

    public List<CustomerExtension> getAllCustomerExtensions() {
        return customerExtensionRepository.findAll();
    }

    public CustomerExtension getCustomerExtensionById(Long id) {
        return customerExtensionRepository.findById(id).orElse(null);
    }
}

