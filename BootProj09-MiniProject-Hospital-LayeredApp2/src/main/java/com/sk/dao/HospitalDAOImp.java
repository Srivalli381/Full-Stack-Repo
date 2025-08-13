package com.sk.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
@Repository("HDAO")
public class HospitalDAOImp implements IHospitalDAO {
	private static final String QUERY="SELECT PID,PNAME,GENDER,PNUMBER FROM HOSPITAL WHERE PNAME IN(?,?,?,?,?) ORDER BY PNAME";
	@Autowired
	private DataSource ds;
	
	@Override
	public List<Hospital> getHospitalByHospitals(String Patient1, String Patient2, String Patient3,String Patient4,String Patient5)throws Exception  {
		List<Hospital> list=new ArrayList<Hospital>();
		try(Connection con=ds.getConnection();
				PreparedStatement ps=con.prepareStatement(QUERY);){
				ps.setString(1, Patient1);
				ps.setString(2, Patient2);
				ps.setString(3, Patient3);
				ps.setString(4, Patient4);
				ps.setString(5, Patient5);
				try(ResultSet rs=ps.executeQuery()){
					while(rs.next())
					{
						Hospital hs=new Hospital();
						hs.setPid(rs.getInt(1));
						hs.setPname(rs.getString(2));
						hs.setGender(rs.getString(3));
						hs.setPnumber(rs.getDouble(4));
					list.add(hs);
					}
				}
		catch(SQLException se) {
			se.printStackTrace();
			throw se;
		}
			catch(Exception e) {
				e.printStackTrace();
				throw e;
			}		
		return list;
	}

	}
}