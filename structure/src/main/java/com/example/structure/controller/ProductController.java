package com.example.structure.controller;

import com.example.structure.entities.Product;
import com.example.structure.services.ProductIService;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;


import java.util.List;
@CrossOrigin
@RestController
public class ProductController {
    @Autowired
    ProductIService pis;
    @PostMapping("addProduct")
    public Product addProduct(Product product) {
        return pis.addProduct(product);
    }

    @GetMapping("retrieveProductById")
    public Product retrieveProductById(Long Id) {
        return pis.retrieveProductById(Id);
    }

    @GetMapping("retrieveAllProduct")
    public List<Product> retrieveAllProduct() {
        return pis.retrieveAllProduct();
    }

    @DeleteMapping("deleteProduct")
    public void deleteProduct(Long id) {
        pis.deleteProduct(id);
    }
}
