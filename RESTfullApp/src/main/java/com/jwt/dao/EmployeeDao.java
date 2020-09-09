package com.jwt.dao;

import java.util.HashMap;
import java.util.Map;

import com.jwt.model.Employee;

public class EmployeeDao {
	private static Map<Integer, Employee> empMap = new HashMap<>();
	static {
		empMap.put(1, new Employee(1, "Mithun Kumar", "Uttar Pradesh", "33333333"));
		empMap.put(2, new Employee(2, "Ravi Kumar", "Madhya Pradesh", "334455556"));
		empMap.put(3, new Employee(3, "Sanjay Mishra", "Karnataka", "98555552"));
		empMap.put(4, new Employee(4, "Rupesh Gupta", "Hydrabad", "98445633"));
		empMap.put(5, new Employee(5, "Kishor Gupta", "Nanital", "987344556"));
		empMap.put(6, new Employee(6, "Juhi Gupta", "Delhi", "978344521"));
		empMap.put(7, new Employee(7, "Rani Gupta", "Bihar", "98458333"));
		empMap.put(8, new Employee(8, "Abhishe Kumar", "Jharkhand", "78674322"));
	}
	
	public static Employee getEmpDetails(Integer empId){
		//emp.set
		return empMap.get(empId);
	}
	public static Employee  addEmpDetails(Employee emp){
		if(empMap.containsKey(emp.getEmpId())){
			//updating the request
			throw new RuntimeException("Employee already  exist.");
		}
		empMap.put(emp.getEmpId(), emp);
		return emp;
	}
	public static Employee updateEmpDetails(Employee emp){
		if(!empMap.containsKey(emp.getEmpId())){
			//updating the request
			throw new RuntimeException("Employee does not  exist.");
		}
		empMap.put(emp.getEmpId(), emp);
		return emp;
	}

}
