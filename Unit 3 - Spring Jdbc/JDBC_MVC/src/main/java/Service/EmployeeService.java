package com.Spring.JDBC_MVC.Service;

import java.util.List;

import JDBC_MVC.entities.Employee;

public interface EmployeeService {
	public int createRecord(Employee emp);
	public Employee readRecord(int empId);
	public int deleteRecord(int empId);
	public List<Employee> fetchRecords();
	void updateRecord(Employee emp);
}
