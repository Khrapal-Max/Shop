package com.example.shop.core.entities;

import javax.persistence.*;

@Entity
@Table(name = "transactions")
public  class Transaction {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "product_id")
    private Integer productId;

    @Column(name = "price")
    private double price;

    public Transaction() {
    }

    public Transaction(Integer id, Integer userId, Integer productId, double price) {
        this.id = id;
        this.userId = userId;
        this.productId = productId;
        this.price = price;
    }

    public Transaction(Integer userId, Integer productId, double price) {
        this.userId = userId;
        this.productId = productId;
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public Integer getUserId() {
        return userId;
    }

    public Integer getProductId() {
        return productId;
    }

    public double getPrice() {
        return price;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "id=" + id +
                ", userId=" + userId +
                ", productId=" + productId +
                ", price=" + price +
                '}';
    }
}