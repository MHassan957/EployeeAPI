package com.etech.service;

import java.util.List;

import com.etech.model.Employee;

public interface EmployeeService {

	Employee createEmployee(Employee employee);

	List<Employee> getListEmployee();

	List<Employee> getListEmployeebyFName(String firstName);

}
