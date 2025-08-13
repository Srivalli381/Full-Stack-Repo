package com.sk.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sk.dao.Hospital;
import com.sk.dao.HospitalDAOImp;
@Service("HService")
public class HospitalServiceImp implements IHospitalService {

	@Autowired
	private HospitalDAOImp dao;
	
	@Override
	public List<Hospital> fetchHospitalByHosputals(String Patient1, String Patient2, String Patient3,String Patient4,String Patient5) throws Exception {
		List<Hospital> list=dao.getHospitalByHospitals(Patient1, Patient2, Patient3,Patient4,Patient5);
		
		return list;
	}

}
