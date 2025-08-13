package com.nt.target;

import java.util.Date;


import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;


@Component("report")
public class ReportGenerator
{

   
    
	@Scheduled(cron="30 0/5 9 ? * ?")
	public void generateSalesReport()
	{
		System.out.println("salesReport On:"+new Date()+"Start");
		
		/*  try { Thread.sleep(5000); } catch(Exception e) { e.printStackTrace(); }
		 		System.out.println("end of salesReport"+new Date());
	*/
	}
}
