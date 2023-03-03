package com.example.structure.services;

import com.example.structure.entities.Product;

import java.util.List;

public interface ProductIService {
    public Product addProduct(Product product);
    public Product retrieveProductById(Long Id);
    public List<Product> retrieveAllProduct();
    public void deleteProduct(Long id);
}
