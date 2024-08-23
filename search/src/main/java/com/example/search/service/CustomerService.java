package com.example.search.service;

import com.example.search.entity.Customer;
import com.example.search.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public Customer searchById(Long id) {
        Optional<Customer> customer = customerRepository.findById(id);
        return customer.orElse(null);  // Returns the Customer object if present, or null if not found
    }

    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }
}
