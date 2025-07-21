package com.scaler.productservicedecmwfeve.inheritanceDemo.singletable;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Instructor extends User {
    private String favouriteStudent;
}