package com.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Employee {
	
	@Id
	 @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int employeeId;
	
	private String employeeName;

	
	@ManyToMany (mappedBy =  "empList")
	private List<Project> projectList;
	
	public Employee() {
		super();
	}

	public Employee(int employeeId, String employeeName, List<Project> projectList) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.projectList = projectList;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public List<Project> getProjectList() {
		return projectList;
	}

	public void setProjectList(List<Project> projectList) {
		this.projectList = projectList;
	}
	
	

}