package com.sk.service;

import java.util.List;

import com.sk.model.Employee;

public interface IEmployeeMgmtService {
public List<Employee> fetchAllEmployeeByDesgs(String desgs1,String desgs2,String desgs3)throws Exception;
}
