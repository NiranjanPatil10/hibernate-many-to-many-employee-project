package com.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Project {

    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int projectId;
    
    private String projectName;

    
    @ManyToMany
    private List<Employee> empList;


    public Project() {
        super();
    }


    public Project(int projectId, String projectName, List<Employee> empList) {
        super();
        this.projectId = projectId;
        this.projectName = projectName;
        this.empList = empList;
    }


    public int getProjectId() {
        return projectId;
    }


    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }


    public String getProjectName() {
        return projectName;
    }


    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }


    public List<Employee> getEmpList() {
        return empList;
    }


    public void setEmpList(List<Employee> empList) {
        this.empList = empList;
    }
    
}