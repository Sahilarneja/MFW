package bean_lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
public static void main(String[] args) {
	AbstractApplicationContext context=new ClassPathXmlApplicationContext("/mfw/src/main/java/bean_lifecycle/life.xml");
	Student stu=context.getBean("student",Student.class);
	System.out.println(stu);
}
}
