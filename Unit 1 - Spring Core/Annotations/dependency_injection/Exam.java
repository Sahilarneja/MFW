package dependency_injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("cmg.xml");
		Student sahil=context.getBean("student",Student.class);
		sahil.displayStudentInfo();
		
	
	}
}
