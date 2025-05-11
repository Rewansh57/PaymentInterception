package com.example.learn.SpringStartsHere.aspects;

import com.example.learn.SpringStartsHere.model.AccountStatus;
import com.example.learn.SpringStartsHere.repositories.BankRepository;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;


@Aspect
@Component

public class LoggingAspect {
    public BankRepository bankRepository;
    @Autowired
    public LoggingAspect(BankRepository bankRepository) {
        this.bankRepository = bankRepository;

    }

    @Around("execution(* com.example.learn.SpringStartsHere.service.PaymentService.paymentRequest(..))")
    public Object LogPayment  (ProceedingJoinPoint joinPoint) throws Throwable{
        Object[] obj=joinPoint.getArgs();// Will get the arguments for the logging credentials
        Long accId=(Long)obj[0];
        Optional<AccountStatus> account=bankRepository.findByAccountId(accId);
        if(account.isPresent()){
            return joinPoint.proceed();


        }
        else {
            System.out.println("Account not found\nPlease enter correct Account Id");
            throw new IllegalArgumentException("Invalid Acc Id "+accId);



        }

        }




}
