package com.example.crud.controllers;

import com.example.crud.domain.product.Product;
import com.example.crud.domain.product.ProductRepository;
import com.example.crud.domain.product.RequestProduct;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductRepository productRepository;
    @GetMapping
    public ResponseEntity getAllProducts() {
        var allProducts = productRepository.findAll();

        return ResponseEntity.ok(allProducts);
    }
    @PostMapping
    public ResponseEntity registerProduct(@RequestBody @Valid RequestProduct data ) {
        Product newProduct = new Product(data);
        System.out.println(data);
        productRepository.save(newProduct);
        return ResponseEntity.ok().build();
    }

    @PutMapping
    public ResponseEntity updateProduct(@RequestBody @Valid RequestProduct data) {

    }
}
