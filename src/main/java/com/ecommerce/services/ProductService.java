package com.ecommerce.services;

import com.ecommerce.dto.ProductDto;
import com.ecommerce.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<ProductDto> getAllProducts() {
        return productRepository.findAll();
    }

    public ProductDto getProductById(Long productId) {
        return productRepository.findById(productId).orElse(null);
    }

    public ProductDto createProduct(ProductDto product) {
        return productRepository.save(product);
    }

    public ProductDto updateProduct(Long productId, ProductDto updatedProduct) {
        if (!productRepository.existsById(productId)) {
            return null;
        }
        updatedProduct.setId(productId);
        return productRepository.save(updatedProduct);
    }

    public boolean deleteProduct(Long productId) {
        if (productRepository.existsById(productId)) {
            productRepository.deleteById(productId);
            return true;
        }
        return false;
    }
}

