package com.scaler.productservicedecmwfeve.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.scaler.productservicedecmwfeve.exceptions.ProductNotExistsException;
import com.scaler.productservicedecmwfeve.models.Category;
import com.scaler.productservicedecmwfeve.models.Product;
import com.scaler.productservicedecmwfeve.repositories.CategoryRepository;
import com.scaler.productservicedecmwfeve.repositories.ProductRepository;

@Service("selfProductService")
public class SelfProductService implements ProductService{

    ProductRepository productRepository;
    CategoryRepository categoryRepository;

    public SelfProductService(ProductRepository productRepository, CategoryRepository categoryRepository) {
        this.productRepository = productRepository;
        this.categoryRepository = categoryRepository;
    }

    @Override
    public Product getSingleProduct(Long id) throws ProductNotExistsException {
        Optional<Product> productOptional=productRepository.findById(id);

        if(productOptional.isEmpty()){
            throw new ProductNotExistsException("product not exists");
        }
        Product savedProduct=productOptional.get();
        return savedProduct;
    }

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product replaceProduct(Long id, Product product) {
        Optional<Product> productOptional=productRepository.findById(id);
        
        if(productOptional.isEmpty()) try {
            throw new ProductNotExistsException("No such product exists in Database");
        } catch (ProductNotExistsException ex) {
        }

        Product savedProduct=productOptional.get();
        savedProduct.setTitle(product.getTitle());
        savedProduct.setDescription(product.getDescription());
        savedProduct.setCategory(product.getCategory());
        savedProduct.setImageUrl(product.getImageUrl());

        return productRepository.save(savedProduct);
    }

    @Override
    public Product addNewProduct(Product product){
        Category category=product.getCategory();

        if(category.getId()==null){
            Category savedCategory=categoryRepository.save(category);
             product.setCategory(savedCategory);
        }
        return productRepository.save(product);
       
    }
    
}
