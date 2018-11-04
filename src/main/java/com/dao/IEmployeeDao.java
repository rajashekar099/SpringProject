package com.dao;

import java.util.List;

import com.pojo.Employee;

public interface IEmployeeDao {
	
	
	Employee getEmployee(int empid);
	
	List<Employee> getAllEmployee();
	
	boolean insertEmployee(Employee emp);
	
}
