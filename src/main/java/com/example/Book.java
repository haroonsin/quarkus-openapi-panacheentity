package com.example;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Book extends PanacheEntity {

//    @Id
//    public Long id;

    public String name;
}
