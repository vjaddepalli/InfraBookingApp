package com.infrabookingapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infrabookingapp.dao.EmployeeDAO;
import com.infrabookingapp.entity.Employee;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeDAO employeeDAO;
	
	public Employee addEmployee(Employee employee) {
		return this.employeeDAO.save(employee);
	}

}
