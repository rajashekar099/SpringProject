package com.pojo;

public class Employee {
		
		private int empid;
		private String empname;
		private String emprole;
		private int empsalary;
		
		public Employee() {
			
		}
		
		public Employee (int empid, String empname, String emprole, int empsalary){
			this.empid = empid;
			this.empname = empname;
			this.emprole = emprole;
			this.empsalary = empsalary;
		}
		//Getters and Setters
		public int getEmpid() {
			return empid;
		}

		public void setEmpid(int empid) {
			this.empid = empid;
		}

		public String getEmpname() {
			return empname;
		}

		public void setEmpname(String empname) {
			this.empname = empname;
		}

		public String getEmprole() {
			return emprole;
		}

		public void setEmprole(String emprole) {
			this.emprole = emprole;
		}

		public int getEmpsalary() {
			return empsalary;
		}

		public void setEmpsalary(int empsalary) {
			this.empsalary = empsalary;
		}

		//tostring method
		@Override
		public String toString() {
			return "Employee [empid=" + empid + ", empname=" + empname + ", emprole=" + emprole + ", empsalary="
					+ empsalary + "]";
		}
				
}
