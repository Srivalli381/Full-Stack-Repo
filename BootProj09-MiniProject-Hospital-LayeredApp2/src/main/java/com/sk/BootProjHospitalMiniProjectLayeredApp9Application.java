package com.sk;
import java.util.List;
import java.util.Scanner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Controller;

import com.sk.controller.HospitalController;
import com.sk.dao.Hospital;
@SpringBootApplication
public class BootProjHospitalMiniProjectLayeredApp9Application {
	public static void main(String[] args) throws Exception {
		try(ConfigurableApplicationContext ctx=SpringApplication.run(BootProjHospitalMiniProjectLayeredApp9Application.class, args);
				Scanner sc=new Scanner(System.in);)
				{
					HospitalController HS=ctx.getBean("HController",HospitalController.class);
					System.out.println("Enter 1 patient ");
					String patient1=sc.next();
					System.out.println("Enter 2 patient ");
					String patient2=sc.next();

					System.out.println("Enter 3 patient");
					String patient3=sc.next();
					System.out.println("Enter 4 patient");
					String patient4=sc.next();
					System.out.println("Enter 5 patient");
					String patient5=sc.next();
					//HospitalController HS=ctx.getBean("HController",HospitalController.class);
					List<Hospital>list=HS.showAllHospitalByHospitals(patient1,patient2 , patient3,patient4, patient5);
						list.forEach(hs->{
						System.out.println(hs);
						});
				}	
		catch(Exception e)
		{
			System.out.println("internal problem::"+e.getMessage());
			e.printStackTrace();
		}		
	  }
	}
	
