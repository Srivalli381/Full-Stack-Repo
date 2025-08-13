package com.sk.service;

import java.util.List;

import com.sk.dao.Hospital;

public interface IHospitalService
{
	public List<Hospital> fetchHospitalByHosputals(String Patient1,String Patient2,String Patient3,String Patient4,String Patient5)throws Exception;
	
}
