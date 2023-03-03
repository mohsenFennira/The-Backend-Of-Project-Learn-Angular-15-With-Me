package com.example.structure.services;

import com.example.structure.entities.Product;
import com.example.structure.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceProduct implements ProductIService {
    @Autowired
    ProductRepository pr;

    @Override
    public Product addProduct(Product product) {
        return pr.save(product);
    }

    @Override
    public Product retrieveProductById(Long Id) {
        return pr.findById(Id).get();
    }

    @Override
    public List<Product> retrieveAllProduct() {
        return (List<Product>) pr.findAll();
    }

    @Override
    public void deleteProduct(Long id) {
         pr.deleteById(id);
    }
}
