package com.example.learn.SpringStartsHere.controller;


import com.example.learn.SpringStartsHere.model.AccountStatus;
import com.example.learn.SpringStartsHere.model.Receipt;
import com.example.learn.SpringStartsHere.repositories.ReceiptRepository;
import com.example.learn.SpringStartsHere.service.PaymentService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payment")
public class PaymentController {
    private final PaymentService paymentService;
    private final ReceiptRepository receiptRepository;

    public PaymentController(PaymentService paymentService, ReceiptRepository receiptRepository){
    this.paymentService = paymentService;
        this.receiptRepository = receiptRepository;
    }

    @GetMapping("/{accid}")
    public AccountStatus getAccountStatus(@PathVariable("accid") Long id) {
        AccountStatus userStatus= paymentService.getStatus(id);
        return userStatus;




    }
    @GetMapping("/{receiptId}")
    public Receipt getReceipt(@PathVariable("receiptId") Long id){
        Receipt receipt=paymentService.receiptStatus(id);
        return receipt;




    }
    @GetMapping("/request/{accId}/{name}/{serviceType}")
    public String request(@PathVariable("accId") Long id, @PathVariable("name") String name, @PathVariable("serviceType") int  serviceType ){
        String outcome =paymentService.paymentRequest(id,name,serviceType);
        return outcome;




    }



}