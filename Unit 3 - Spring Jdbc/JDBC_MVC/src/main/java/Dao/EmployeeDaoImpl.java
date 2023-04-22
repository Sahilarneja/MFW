package com.Spring.JDBC_MVC.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import JDBC_MVC.entities.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public int insertEmployee(Employee emp) {
		String query = "insert into employee(empId,empName, empSalary, empAddress) values(?,?,?,?)";
		Object[] arr = { emp.getEmpId(), emp.getEmpName(), emp.getEmpSalary(), emp.getEmpAddress() };
		return jdbcTemplate.update(query, arr);
	}

	@Override
	public Employee fetchEmployee(int empId) {
		String sql = "select * from employee where empId=?";
		return jdbcTemplate.queryForObject(sql, new EmployeeDaoRowMapper(), empId);
	}

	@Override
	public int deleteEmployee(int empId) {
		String query = "delete from employee where empId=?";
		return jdbcTemplate.update(query, empId);
	}

	@Override
	public List<Employee> fetchEmployees() {
		String query = "select * from employee";

		return jdbcTemplate.query(query, new EmployeeDaoRowMapper());

	}

	@Override
	public int updateEmployee(Employee emp) { 
		String sql="update employee set empName=?, empSalary=?, empAddress=? where empId=?";
		Object[]arg={emp.getEmpName(),emp.getEmpSalary(),emp.getEmpAddress(),emp.getEmpId()};
		int recordsupdated=jdbcTemplate.update(sql,arg);
		return recordsupdated;
	}

	

}
