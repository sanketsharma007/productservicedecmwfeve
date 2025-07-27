package com.scaler.productservicedecmwfeve.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.scaler.productservicedecmwfeve.models.Category;
import com.scaler.productservicedecmwfeve.models.Product;

@Repository                                             //Object  Datatype of primary key of object
public interface ProductRepository extends JpaRepository<Product, Long> {

   // List<Product> findByName(String name);

    List<Product> findByCategory(Category category);

    List<Product> findByPriceBetween(Double minPrice, Double maxPrice);

    Product save(Product p);
}