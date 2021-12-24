package com.vkakarla.grouph.service;

import com.vkakarla.grouph.model.Employee;

public interface IEmployeeService {
	
	 public void createEmployee(Employee employee);
	 
	 public Employee getEmployee(String empId);
	 
	 public Employee updateEmployee(Employee employee);
	 
	 public void deleteEmployee(String empId);
	 

}
