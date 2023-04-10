package com.springcore.pre_post;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class App 
{
    public static void main( String[] args )
    {
        AbstractApplicationContext context=new ClassPathXmlApplicationContext("hello");
        context.registerShutdownHook();
        
        subject sub=(subject) context.getBean("s1");
        System.out.println(sub);
    }
}
