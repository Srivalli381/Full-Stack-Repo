package com.sk.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.sk.model.Employee;
import com.sk.service.EmployeeService;

@Controller("empcon")
public class EmployeeController {
@Autowired
private EmployeeService service;
public List<Employee> showAllEmployeesBEmployees(String desgs1,String desgs2,String desgs3)throws Exception{
	List<Employee>list=service.fetchAllEmployeeByDesgs(desgs3, desgs2, desgs3);
	return list;
}
}
