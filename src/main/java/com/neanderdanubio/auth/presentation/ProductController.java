package com.neanderdanubio.auth.presentation;

import com.neanderdanubio.auth.application.services.ProductServices;
import com.neanderdanubio.auth.domain.entities.Product;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    private final ProductServices  productServices;

    public ProductController(ProductServices productServices) {
        this.productServices = productServices;
    }
    @PostMapping
    public ResponseEntity<Product> create(@RequestBody Product product) {
        return ResponseEntity.ok(productServices.create(product));
    }
    @GetMapping
    public ResponseEntity<List<Product>> getAll() {
        return ResponseEntity.ok(productServices.findAllProducts());
    }
}
