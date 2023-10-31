package com.deeptech.hibernate.work2.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class Employee {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
 @Column(name="empid")	
 private int empid;
	@Column(name="email")
	private String email;
  public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
@Column(name="empname")
 private String empname;
  @Column(name="designation")
 private String designation;
  @Column(name="salary")
 private double salary;
public String getEmpname() {
	return empname;
}
public void setEmpname(String empname) {
	this.empname = empname;
}
public String getDesignation() {
	return designation;
}
public void setDesignation(String designation) {
	this.designation = designation;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
}
