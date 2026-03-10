package com.controller;

import java.util.ArrayList;
import java.util.List;

import com.model.Employee;

import com.model.Project;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class TestEmployeeProject {


    public static void main(String[] args) {
        
        EntityManagerFactory emf=Persistence.createEntityManagerFactory("emp_proj");
        
        EntityManager em=emf.createEntityManager();
        
        
        Employee e1 = new Employee();
        e1.setEmployeeName("Ajay");

        Employee e2 = new Employee();
        e2.setEmployeeName("Vijay");

        List<Employee> empList = new ArrayList<>();
        empList.add(e1);
        empList.add(e2);

        Project p1 = new Project();
        p1.setProjectName("Ecommerce");
        p1.setEmpList(empList);

        Project p2 = new Project();
        p2.setProjectName("EPFproject2");
     
        
        List<Project> projectList=new ArrayList<Project>();
        
        projectList.add(p1);
        projectList.add(p2);
        
        p1.setEmpList(empList);
        p2.setEmpList(empList);
        e1.setProjectList(projectList);
        e2.setProjectList(projectList);
        
        em.getTransaction().begin();
        em.persist(e1);
        em.persist(e2);
        em.persist(p1);
        em.persist(p2);
        
        em.getTransaction().commit();
        
        
        
        
    }
}