package com.example.learn.SpringStartsHere.exceptions;

public class PaymentError extends RuntimeException {
    public PaymentError(String message) {
        super(message);

    }

}
