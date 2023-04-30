package com.aop.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class MyAspect {
	
	//Advice(action)
	//pointcut= where you wnt to call the method
	@Before("myPointCut()")
	public void printBefore() {
		System.out.println("Payment Started....");
	}
	
	@After("myPointCut()")
	public void printAfter() {
		System.out.println("Payment Done....");
	}
	
	//define a pointcut once and it can be used in multiple places
	
	@Pointcut("execution(* com.aop.service.PaymentServiceImpl.makePayment())")
	public void myPointCut() {
	}
	
	@AfterReturning("myPointCut()")  //It runs after the result is returned by the method.
	public void myAfterReturning() {
		System.out.println("after returning executed...");
	}
	
	@AfterThrowing("myPointCut()") //It runs after an exception is thrown by the method.
	public void myAfterThrowing() {
		System.out.println("AfterThrowing is now executed");
	}
	
	
}
