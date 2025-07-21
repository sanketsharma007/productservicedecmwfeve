package com.scaler.productservicedecmwfeve.inheritanceDemo.mappedSuperClass;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "ms_Mentor")
public class Mentor extends User {
    private double avgRating;
}
