package com.pos.service;

import java.util.List;

import com.pos.entity.Employee;

public interface IEmployeeService {
	
	Employee saveOrUpdateEmployee(Employee emp);
	void deleteEmployeeById(int empId);
	Employee getEmpById(int empId);
	Employee getEmpByName(String empName);
	List<Employee> getAllEmployees();

}
