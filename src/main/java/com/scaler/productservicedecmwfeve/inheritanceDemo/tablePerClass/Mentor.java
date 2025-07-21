package com.scaler.productservicedecmwfeve.inheritanceDemo.tablePerClass;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity(name = "tbc_mentor")
public class Mentor extends User {
    private double avgRating;
}
