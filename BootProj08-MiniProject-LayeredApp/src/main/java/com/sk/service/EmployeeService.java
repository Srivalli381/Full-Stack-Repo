package com.sk.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sk.dao.IEmployeeDAO;
import com.sk.model.Employee;
@Service("empService")
public class EmployeeService implements IEmployeeMgmtService {

	@Autowired
	private IEmployeeDAO empDAO;
	@Override
	public List<Employee> fetchAllEmployeeByDesgs(String desgs1, String desgs2, String desgs3) throws Exception {
		/*
		 * desgs1=desgs1.toUpperCase(); desgs2=desgs2.toUpperCase();
		 * desgs3=desgs3.toUpperCase();
		 */
		
		List<Employee>list=empDAO.getEmployeeByDesgs(desgs1,desgs2,desgs3);
//		list.sort((t1,t2)->t1.getEno().compareTo(t2.getEno()));
//	list.forEach(emp->{
//				
////		emp.setGrossSalary(emp.getGrossSalary()+(emp.getSalary()*0.5));
////		emp.setNetSalary(emp.getGrossSalary()-(emp.getGrossSalary()*0.2));
//		
//	});
		return list;
	}
}
