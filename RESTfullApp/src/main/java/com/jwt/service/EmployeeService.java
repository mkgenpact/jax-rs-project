package com.jwt.service;

import com.jwt.dao.EmployeeDao;
import com.jwt.model.Employee;

public class EmployeeService {

	public static Employee getEmpDetails(Integer empID){
		return EmployeeDao.getEmpDetails(empID);
	}
	
	public static Employee addEmployeeDetails(Employee emp){
		return EmployeeDao.addEmpDetails(emp);
	}
	
	public static Employee updateEmployeeDetails(Employee emp){
		return EmployeeDao.updateEmpDetails(emp);
	}
}
