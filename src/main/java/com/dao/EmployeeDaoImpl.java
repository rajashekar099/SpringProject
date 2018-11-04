package com.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.pojo.Employee;

@Repository
public class EmployeeDaoImpl implements IEmployeeDao {
		
		@Autowired
		private JdbcTemplate jdbcTemplateObj;
	
		public JdbcTemplate getJdbcTemplateObj() {
			return jdbcTemplateObj;
		}

		public void setJdbcTemplateObj(JdbcTemplate jdbcTemplateObj) {
			this.jdbcTemplateObj = jdbcTemplateObj;
		}
		
		public Employee getEmployee(int empid) {
			String query = "Select * from employee where id = ?";
					//one row of output object - queryforobject
			Employee empObj = jdbcTemplateObj.queryForObject(query, new Object[]{empid}, new BeanPropertyRowMapper<Employee>(Employee.class));
			
			return empObj;
		}

	public List<Employee> getAllEmployee() {
		String query = "Select * from employee";
		List<Employee> listOFEmployee = jdbcTemplateObj.query(query,new BeanPropertyRowMapper<Employee>(Employee.class));
		return listOFEmployee;
	}

	public boolean insertEmployee(Employee emp) {
		// TODO Auto-generated method stub
		return false;
	}

}
