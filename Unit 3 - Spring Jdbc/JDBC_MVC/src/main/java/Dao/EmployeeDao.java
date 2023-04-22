package com.Spring.JDBC_MVC.Dao;

import java.util.List;

import JDBC_MVC.entities.Employee;

public interface EmployeeDao {
	public int insertEmployee(Employee emp);
	public Employee fetchEmployee(int empId);
	public int deleteEmployee(int empId);
	public List<Employee> fetchEmployees();
	public int updateEmployee(Employee emp);
}
