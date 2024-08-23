package com.example.search.repository;

import com.example.search.entity.ProductExtension;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductExtensionRepository extends JpaRepository<ProductExtension, Long> {
    List<ProductExtension> findByProductId(Long productId);
}
