package com.services;

import java.util.List;

import com.pojo.Employee;

public interface IEmployeeSrc {

	Employee getEmployee(int empid);
	
	List<Employee> getAllEmployee();
	
	boolean insertEmployee(Employee emp);
}
