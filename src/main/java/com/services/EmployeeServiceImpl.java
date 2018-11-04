package com.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.IEmployeeDao;
import com.pojo.Employee;

@Service
public class EmployeeServiceImpl implements IEmployeeSrc {
	@Autowired
	private  IEmployeeDao employeeDao;
	
	public IEmployeeDao getEmployeeDao() {
		return employeeDao;
	}
	
	public void setEmployeeDao (IEmployeeDao employeeDao){
			this.employeeDao = employeeDao;
	}
	
	public Employee getEmployee(int empid) {
		Employee empObj = employeeDao.getEmployee(empid);
		return empObj;
	}

	public List<Employee> getAllEmployee() {
		List<Employee> ListOfEmployee = employeeDao.getAllEmployee();
		return ListOfEmployee;
	}

	public boolean insertEmployee(Employee emp) {
		// TODO Auto-generated method stub
		return false;
	}
	
}
