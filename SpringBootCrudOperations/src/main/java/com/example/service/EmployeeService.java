package com.example.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.entity.Employee;

@Service
public interface EmployeeService {
	//create, getEmp, getEmpById, delete, Update
	
	public Employee createEmp(Employee emp);
	
	public List<Employee> getEmployees();
	
	public Employee getEmployee(int id);
	
	public Employee updateEmp(Employee emp, int id);
	
	public void deleteEmp(int id);
	
}
