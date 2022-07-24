package com.example.shop.core.entities;

import javax.persistence.*;

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
    private String LastName;

    @Column(name = "amount")
    private Decimal AmountOfMoney;
    public Integer getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public Decimal getAmountOfMoney() {
        return AmountOfMoney;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public void setAmountOfMoney(Decimal amountOfMoney) {
        AmountOfMoney = amountOfMoney;
    }
}