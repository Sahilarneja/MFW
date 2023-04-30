package com.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aop.service.PaymentService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("Config.xml");
        PaymentService ps=context.getBean("payment",PaymentService.class);
       
        //auth, print:PaymentStarted(JoinPoint)
        ps.makePayment();
    }
}
