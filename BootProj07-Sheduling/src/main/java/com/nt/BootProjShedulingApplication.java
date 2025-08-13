package com.nt;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class BootProjShedulingApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootProjShedulingApplication.class, args);
	System.out.println("app started at:"+new Date());
	}

}
