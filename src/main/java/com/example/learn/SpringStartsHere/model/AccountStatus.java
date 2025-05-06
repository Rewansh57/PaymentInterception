package com.example.learn.SpringStartsHere.model;

import jakarta.persistence.*;

@Entity


public class AccountStatus {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)



    private Long userId;
    @Column(unique=true)
    private Long accountId;
    private String name;


    private double balance;


    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
