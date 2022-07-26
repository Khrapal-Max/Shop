package com.example.shop.core.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "users")
public  class User {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "amount")
    private double amountOfMoney;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "transactions",
            joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "product_id", referencedColumnName = "id"))
    private List<Product> products;

    public User() {
    }

    public User(String firstName, String lastName, double amountOfMoney) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.amountOfMoney = amountOfMoney;
    }

    public User(Integer id, String firstName, String lastName, double amountOfMoney) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.amountOfMoney = amountOfMoney;
    }

    public Integer getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getAmountOfMoney() {
        return amountOfMoney;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setId(Integer id) { this.id = id; }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAmountOfMoney(double amountOfMoney) {
        this.amountOfMoney = amountOfMoney;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", amountOfMoney=" + amountOfMoney +
                '}';
    }
}