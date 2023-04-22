package com.Spring.JDBC_MVC.Dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

import JDBC_MVC.entities.Employee;

public class EmployeeDaoRowMapper implements RowMapper<Employee> {

	@Override
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
			Employee emp = new Employee();
			emp.setEmpId(rs.getInt(1));
			emp.setEmpName(rs.getString(2));
			emp.setEmpSalary(rs.getDouble(3));
			emp.setEmpAddress(rs.getString(4));
			return emp;
		}
	
	}

	


