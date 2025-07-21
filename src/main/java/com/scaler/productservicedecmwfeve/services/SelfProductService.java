package com.scaler.productservicedecmwfeve.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.scaler.productservicedecmwfeve.exceptions.ProductNotExistsException;
import com.scaler.productservicedecmwfeve.models.Product;
import com.scaler.productservicedecmwfeve.repositories.CategoryRepository;
import com.scaler.productservicedecmwfeve.repositories.ProductRepository;

@Service("selfProductService")
public class SelfProductService implements ProductService{

    ProductRepository productRepository;
    CategoryRepository categoryRepository;

    SelfProductService(ProductRepository productRepository, CategoryRepository categoryRepository) {
        this.productRepository = productRepository;
        this.categoryRepository = categoryRepository;
    }

    @Override
    public Product getSingleProduct(Long id) throws ProductNotExistsException {
        throw new UnsupportedOperationException("Unimplemented method 'getSingleProduct'");
    }

    @Override
    public List<Product> getAllProducts() {
        throw new UnsupportedOperationException("Unimplemented method 'getAllProducts'");
    }

    @Override
    public Product replaceProduct(Long id, Product product) {
        throw new UnsupportedOperationException("Unimplemented method 'replaceProduct'");
    }
    
}
