package com.scaler.productservicedecmwfeve.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Category {
    @Id
    private Long id;
    private String name;

//    public String getName() {
//        System.out.println( userName + " has called this method.");
//        System.out.println("nothi");
//    }
}
