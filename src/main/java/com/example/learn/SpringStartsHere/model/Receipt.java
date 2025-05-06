package com.example.learn.SpringStartsHere.model;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity

public class Receipt {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)


    private Long receiptId;
    private String serviceName;

    private String status;
    private BigDecimal amount;
   public  Receipt(Long receiptId,String serviceName,String status ,BigDecimal amount){
        this.receiptId = receiptId;
        this.serviceName = serviceName;
        this.status = status;
        this.amount = amount;

    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public Long getReceiptId() {
        return receiptId;
    }

    public void setReceiptId(Long receiptId) {
        this.receiptId = receiptId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
}
