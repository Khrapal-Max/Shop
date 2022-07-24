package com.example.shop.core.entities;

import javax.persistence.*;

@Entity
@Table(name = "products")
public  class Product {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "price")
    private Decimal price;

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Decimal getPrice() {
        return price;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(Decimal price) {
        this.price = price;
    }
}