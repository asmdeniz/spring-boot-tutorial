package com.deniz.asmin.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class User {
    @Id
    private Long id;
    private String firstName;
    private String lastName;
}
