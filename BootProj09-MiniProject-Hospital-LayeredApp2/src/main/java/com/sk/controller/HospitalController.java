package com.sk.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.sk.dao.Hospital;
import com.sk.service.HospitalServiceImp;

@Controller("HController")
public class HospitalController {
	@Autowired
	private HospitalServiceImp hs;
	public List<Hospital> showAllHospitalByHospitals(String patient1,String patient2,String patient3,String patient4,String patient5)throws Exception{
		List<Hospital> list=hs.fetchHospitalByHosputals(patient1, patient2, patient3 ,patient4 ,patient5);
		return list;
		
	}
	
	
}
