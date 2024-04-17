package com.springbootrestapi.service;

//Importing required classes
import java.util.List;
import java.util.Objects;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbootrestapi.entity.*;
import com.springbootrestapi.repository.*;

//Annotation
@Service

//Class
public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeRepository employeeRepository;

	// Save operation
	@Override
	public Employee saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeRepository.save(employee);
	}

	// Read operation
	@Override
	public List<Employee> fetchEmployeeList() {
		return (List<Employee>) employeeRepository.findAll();
	}

	// Update operation
	@Override
	public Employee updateEmployee(Employee employee, Long employeeId) {
		// id
		Employee depDB = employeeRepository.findById(employeeId).get();
		// name
		if (Objects.nonNull(employee.getName()) && !"".equalsIgnoreCase(employee.getName())) {
			depDB.setName(employee.getName());
		}
		// location
		if (Objects.nonNull(employee.getLocation()) && !"".equalsIgnoreCase(employee.getLocation())) {
			depDB.setLocation(employee.getLocation());
		}
		// department
		if (Objects.nonNull(employee.getDepartment()) && !"".equalsIgnoreCase(employee.getDepartment())) {
			depDB.setDepartment(employee.getDepartment());
		}

		return employeeRepository.save(depDB);
	}

	// Delete operation
	@Override
	public void deleteEmployeeById(Long employeeId) {
		employeeRepository.deleteById(employeeId);

	}

}
