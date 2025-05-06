package com.example.learn.SpringStartsHere.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component

public class LoggingAspect {
    @Before("execution(* com.example.learn.SpringStartsHere.service.CommentService.publicComment(..))")
    public void show(){
        System.out.println("LoggingAspect");

    }
}
