package com.scaler.productservicedecmwfeve.services;

import java.util.List;

import com.scaler.productservicedecmwfeve.exceptions.ProductNotExistsException;
import com.scaler.productservicedecmwfeve.models.Product;

public interface ProductService {

    Product getSingleProduct(Long id) throws ProductNotExistsException;

    List<Product> getAllProducts();

    Product replaceProduct(Long id, Product product);

    Product addNewProduct(Product product);
}
