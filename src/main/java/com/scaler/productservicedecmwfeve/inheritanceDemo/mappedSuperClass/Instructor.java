package com.scaler.productservicedecmwfeve.inheritanceDemo.mappedSuperClass;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "ms_Instructor")
public class Instructor extends User{
    private String favouriteStudent;
}
