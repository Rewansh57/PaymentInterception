package com.example.learn.SpringStartsHere.model;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity


public class AccountStatus {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)



    private Long userId;
    @Column(unique=true)
    private Long accountId;
    private String name;


    private BigDecimal balance;


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

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }
    public void getUserInfo(){
        System.out.println("Acc id" +this.accountId+" Name "+this.name+" Balance "+this.balance);

    }
}
