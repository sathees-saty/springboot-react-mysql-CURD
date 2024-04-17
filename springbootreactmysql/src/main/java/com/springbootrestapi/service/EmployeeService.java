package com.springbootrestapi.service;

//Importing required classes
import java.util.List;

import com.springbootrestapi.entity.*;

//Interface
public interface EmployeeService {
	
	// Save operation
	Employee saveEmployee(Employee employee);

	// Read operation
	List<Employee> fetchEmployeeList();

	// Update operation
	Employee updateEmployee(Employee employee,
								Long employeeId);

	// Delete operation
	void deleteEmployeeById(Long employeeId);

}
