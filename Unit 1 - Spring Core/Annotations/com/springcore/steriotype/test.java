package com.springcore.steriotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("/mfw/src/main/java/com/springcore/steriotype/sterioconfig.xml");
	Student student=context.getBean("student",Student.class);
	System.out.println(student);
}
}
