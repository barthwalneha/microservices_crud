package com.product.microservices.crudoperations.service;

import com.product.microservices.crudoperations.model.Product;
import com.product.microservices.crudoperations.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public String addProduct(Product product) {
        productRepository.save(product);
        return "Product Added Successfully";
    }

    public String deleteProduct(Long id) {
        productRepository.deleteById(id);
        return "Product deleted Successfully";
    }

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Product getProductById(long id) {
        return productRepository.findById(id).orElse(null);
    }
}
