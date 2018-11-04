package com.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pojo.Employee;
import com.services.IEmployeeSrc;

@Controller 
@RequestMapping(value="/employee")
public class EmployeeDetailsCtrl {

		@Autowired// employeeService injected for controller layer
		private IEmployeeSrc employeeService;
		
		
		public IEmployeeSrc getEmployeeService() {
			return employeeService;
		}

		public void setEmployeeService(IEmployeeSrc employeeService) {
			this.employeeService = employeeService;
		}

	@RequestMapping(value="/get", method=RequestMethod.GET)
		// Declare public access specifier
	public @ResponseBody Employee getEmployee(@RequestParam int empid) {
			//Requestparam : Normal rawtype of data is passed in requestparam
		Employee empObj = employeeService.getEmployee(empid);
					return empObj;
		}

	@RequestMapping(value="/all", method=RequestMethod.GET)
	public @ResponseBody List<Employee> getAllEmployee(){
		
		List<Employee> listOfEmployee = employeeService.getAllEmployee();
		
		return listOfEmployee;
		
	}

	@RequestMapping(value="/insert", method=RequestMethod.POST)
	public @ResponseBody String insertEmployee(@RequestBody Employee emp){
						// Requestbody object type of data is declared in requestbody
	System.out.println("received rest of insertStudent method");
	return "Inserted Sucessfully";
				
		}
}