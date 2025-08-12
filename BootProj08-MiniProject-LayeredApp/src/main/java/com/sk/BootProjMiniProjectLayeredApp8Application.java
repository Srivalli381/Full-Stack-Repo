package com.sk;

import java.util.List;
import java.util.Scanner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.sk.controller.EmployeeController;
import com.sk.model.Employee;

@SpringBootApplication
public class BootProjMiniProjectLayeredApp8Application {

	public static void main(String[] args) {
		try(ConfigurableApplicationContext ctx=SpringApplication.run(BootProjMiniProjectLayeredApp8Application.class, args);
			Scanner sc=new Scanner(System.in);)
			{
			
			EmployeeController controller=ctx.getBean("empcon",EmployeeController.class);
		
			System.out.println("enter Desgs1::");
			String desgs1=sc.next();
			System.out.println("enter Desgs2::");
			String desgs2=sc.next();
			System.out.println("enter Desgs3::");
			String desgs3=sc.next();
			
			//b.method
			List<Employee> list=controller.showAllEmployeesBEmployees(desgs1, desgs2, desgs3);
//			System.out.println("employee belonging to"+desgs1+""+desgs2+""+desgs3+"are");
			
			list.forEach(emp->{
				System.out.println(emp);
			});
			}
		
			catch(Exception e)
			{
				System.out.println("internal problem::"+e.getMessage());
				
			
				e.printStackTrace();
			}		
	}
		
	}
	
