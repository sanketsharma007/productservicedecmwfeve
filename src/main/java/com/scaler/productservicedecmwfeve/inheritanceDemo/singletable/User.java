package com.scaler.productservicedecmwfeve.inheritanceDemo.singletable;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "st_User")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class User {
    @Id
    private Long id;
    private String name;
    private String email;
}
