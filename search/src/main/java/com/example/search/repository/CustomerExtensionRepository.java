package com.example.search.repository;

import com.example.search.entity.CustomerExtension;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerExtensionRepository extends JpaRepository<CustomerExtension, Long> {
    List<CustomerExtension> findByCustomerId(Long id); // Adjust this method based on your entity
}
