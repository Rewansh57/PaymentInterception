package com.example.learn.SpringStartsHere.service;


import com.example.learn.SpringStartsHere.model.Receipt;
import com.example.learn.SpringStartsHere.repositories.BankRepository;
import com.example.learn.SpringStartsHere.repositories.ReceiptRepository;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Optional;
import java.util.logging.Logger;

@Service
public class PaymentService {
    private final BankRepository bankRepository;
    private final ReceiptRepository receiptRepository;

    public PaymentService(BankRepository bankRepository, ReceiptRepository receiptRepository) {
        this.bankRepository = bankRepository;
        this.receiptRepository = receiptRepository;
    }

    public Receipt receiptStatus(Long receiptId) {
        Optional<Receipt> receipt = receiptRepository.findById(receiptId);
        if (receipt.isPresent()) {
            return receipt.get();

        } else {
            return new Receipt(-1L, "Nil", "No such Receipt Present", new BigDecimal(00.00));
        }
    }

    public String paymentRequest(Long accountId, String name, int serviceType) {
        Optional<BigDecimal> userBalance = bankRepository.getBalanceByAccountId(accountId);

        if (userBalance.isPresent() && (userBalance.get().compareTo(BigDecimal.valueOf(1000)) >= 0)) {
            BigDecimal balance = userBalance.get().subtract(BigDecimal.valueOf(1000));
            bankRepository.updateBalance(balance, accountId);
            return "The Payment was carried out successfully";


        }
        else {
            return "the User Does not have Enough Balance For the payment";

        }


    }


}
