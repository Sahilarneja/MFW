package com.Spring.JDBC_MVC.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.Spring.JDBC_MVC.Service.EmployeeService;

import JDBC_MVC.entities.Employee;

@Controller
public class EmployeeController {
	
	@Autowired
	private EmployeeService empService;
	
	
	@ModelAttribute(name="employee")
	private Employee getEmployee() {
		return new Employee();
	}
	
	
	@RequestMapping(value="/form",method=RequestMethod.GET)
	public String getEmployeeForm()
{
		return "employee-form";
		}
	
	@RequestMapping(value = "/process", method = RequestMethod.POST)
	//	@PostMapping(value = "/process")
	public String processEmployeeForm(@ModelAttribute("employee") Employee emp) {
		/* EmployeeService empService = new EmployeeServiceImpl(); */
		if(empService.createRecord(emp) == 1)
			return "confirmation";
		else
			return "redirect:/";
	}
	
//	 method to fetch all the employee records
	@RequestMapping(value = "/show")
	public String showEmployees(Model model) {
		List<Employee> employees = empService.fetchRecords();
		model.addAttribute("employees", employees);
		return "employee-list";
	}
	
	//Controller mapping for processing the delete operation
	@GetMapping("/deleteEmployee")
	public String DeleteEmployee(@RequestParam("empId")int empId) {
		empService.deleteRecord(empId);
		return "redirect:/show";
	}
	
	//Controller mapping for update form
	@GetMapping("/updateForm")
	public String ShowUpdateForm(@RequestParam("empId")int empId, @ModelAttribute("emp")Employee employee,Model model) {
		System.out.println("Getting the employee data for id: "+empId);
		employee=empService.readRecord(empId);
		model.addAttribute(employee);
		return "employee-update-form";
		
	}
	
	//controller mapping for processing the update operation
	@PostMapping("/processupdate")
	public String processUpdateForm(@ModelAttribute("employee") Employee emp) {
		empService.updateRecord(emp);
		return "confirmation";
	}
}
