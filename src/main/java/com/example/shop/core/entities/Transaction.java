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

    //need data time

    public Transaction() {
    }

    public Transaction(Integer id, Integer userId, Integer productId) {
        this.id = id;
        this.userId = userId;
        this.productId = productId;
    }

    public Transaction(Integer userId, Integer productId) {
        this.userId = userId;
        this.productId = productId;
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

    public void setId(Integer id) {
        this.id = id;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "id=" + id +
                ", userId=" + userId +
                ", productId=" + productId +
                '}';
    }
}