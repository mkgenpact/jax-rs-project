package com.jwt.model;

import javax.xml.bind.annotation.XmlRootElement;

public class Employee {
	
	private Integer empId;
	private String empName;
	private String address;
	private String contactNo;
	
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public Employee(){
		
	}
	public Employee(Integer empId, String empName, String address,
			String contactNo) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.address = address;
		this.contactNo = contactNo;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getContactNo() {
		return contactNo;
	}
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName
				+ ", address=" + address + ", contactNo=" + contactNo + "]";
	}
	
	

}
