package com.neanderdanubio.auth.domain.repository;

import com.neanderdanubio.auth.domain.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
