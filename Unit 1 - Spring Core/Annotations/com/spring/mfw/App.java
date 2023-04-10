package com.spring.mfw;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ){
    	ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
    	airtel air=context.getBean("airtel",airtel.class);
    	air.calling();
    	air.data();
    }
}
