package com.Spring.JDBC_MVC.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Spring.JDBC_MVC.Dao.EmployeeDao;

import JDBC_MVC.entities.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao empDao;
	
	@Override
	public int createRecord(Employee emp) {
		if(empDao.insertEmployee(emp) == 1) {
			System.out.println("Record inserted Successfully!!");
			return 1;
		}
			
		else {
			System.out.println("Error saving record!!!");
			return 0;
		}
	}

	@Override
	public Employee readRecord(int empId) {
		Employee emp1=empDao.fetchEmployee(empId);
		return emp1;
	}

	@Override
	public void updateRecord(Employee emp) {
		int updated=empDao.updateEmployee(emp);
		if(updated==1) {
			System.out.println("Record Updated Sucessfully...");
			
		}
		else {
			System.out.println("Error Occurred");
		}
	}

	@Override
	public int deleteRecord(int empId) {
		if(empDao.deleteEmployee(empId)==1) {
			System.out.println("Record deleted Successfully");
			return 1;
		}
		else {
			System.out.println("Error deleting record..");
			return 0;
		}
		
		
	}

	

	@Override
	public List<Employee> fetchRecords() {
		 List<Employee> emps = empDao.fetchEmployees();
		 if(emps != null)
			 return emps;
		 else
			 return null;
	}
}


