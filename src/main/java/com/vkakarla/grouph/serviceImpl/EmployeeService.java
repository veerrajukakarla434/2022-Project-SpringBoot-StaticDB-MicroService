package com.vkakarla.grouph.serviceImpl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.vkakarla.grouph.model.Employee;
import com.vkakarla.grouph.service.IEmployeeService;

@Service
public class EmployeeService implements IEmployeeService {
	
	
	public static final Map<String, Employee> mapDB = new HashMap<>(); 
	
	static {
		 
		 Employee employee = new Employee();
		 employee.setEmmId("100");
		 employee.setName("Somesh");
		 employee.setAddress("Bangolore-IND");
		 employee.setPhone("1234567890");
		 mapDB.put(employee.getEmmId(), employee);
		 
	 }
	

	@Override
	public void createEmployee(Employee employee) {
		
		mapDB.put(employee.getEmmId(), employee);
	}

	@Override
	public Employee getEmployee(String empId) {
		
		Employee empResponse = mapDB.get(empId);
		return empResponse;
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		mapDB.put(employee.getEmmId(), employee);
		Employee empResponse = mapDB.get(employee.getEmmId());
		return empResponse;
	}

	@Override
	public void deleteEmployee(String empId) {
		mapDB.remove(empId);

	}

}
