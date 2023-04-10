package com.spring.jdbc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.spring.jdbc.entities.Student;

public class StudentDaoImpl implements StudentDao{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public int insert(Student student) {
	
	//insert query
        String insert="insert into student(id,name,city) values(?,?,?)";
       int i= this.jdbcTemplate.update(insert,student.getId(),student.getName(),student.getCity());
		return i;
	}
	
	//update query
	public int change(Student student) {
		String change="update student set name=? , city=? where id=? ";
		int r=this.jdbcTemplate.update(change,student.getName(), student.getCity(),student.getId());
		return r;
		
	}
	
	//Delete query
	public int delete(int studentId) {
		String delete="delete from student where id=?";
		int s=this.jdbcTemplate.update(delete,studentId);
		return s;
	}
	
	public Student getStudent(int studentId) {
		//SELECT  SINGLE STUDENT
		String select="select*from student where id=?";
		RowMapper<Student> rowMapper=new RowMapperImpl();
		Student student=this.jdbcTemplate.queryForObject(select, rowMapper,studentId);
		return student;
	}
	
	
	public List<Student> getAllStudents() {
		//SELECT MULTIPLE STUDENT
		String select="select*from student";
		List<Student> students=this.jdbcTemplate.query(select, new RowMapperImpl());
		return students;
	}
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	


}
