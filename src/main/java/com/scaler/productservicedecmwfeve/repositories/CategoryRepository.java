package com.scaler.productservicedecmwfeve.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.scaler.productservicedecmwfeve.models.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
    
    Category save(Category category);

}
