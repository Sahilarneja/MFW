package com.spring.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.entities.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "My Program Started......" );
        //spring jdbc=> JdbcTemplate
        
        //ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
        ApplicationContext context=new AnnotationConfigApplicationContext(jdbcConfig.class);
        StudentDao studentDao=context.getBean("studentDao",StudentDao.class);
        
        
        
//        INSERT QUERY
//        Student student=new Student();
//        student.setId(444);
//        student.setName("Aditya");
//        student.setCity("Faridabad");
//        
//        int result=studentDao.insert(student);
//        
//        System.out.println("Student added"+result);
      
        
        //UPDATE QUERY
//        Student student=new Student();
//        student.setName("Vidit");
//        student.setCity("Rewari");
//        student.setId(444);
//        
//        int result=studentDao.change(student);
//        System.out.println("Student details changed: "+result);
       
        //DELETE QUERY
//        int res=studentDao.delete(444);
//        System.out.println("DELETED: "+res);
        
        //SELECT QUERY- FOR SINGLE STUDENT
//        Student student=studentDao.getStudent(111);
//        System.out.println(student);
        
        //SELECT QUERY FOR MULTIPLE STUDENT
       List<Student> students=studentDao.getAllStudents();
      for(Student s: students) {
    	  System.out.println(s);
      }
    }
} 
