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

import com.sk.model.Employee;


@Repository("empDAO")//Exception handling
public class EmployeeDAO implements IEmployeeDAO 
{
   private static final String GET_EMPS_QUERY="select eid,efname,elname,esal,eaddress from employee where eaddress in(?,?,?) order by eaddress";
   
   @Autowired
   private DataSource ds;
   
	@Override
	public List<Employee> getEmployeeByDesgs(String desg1, String desg2, String desg3) throws Exception {
		List<Employee>list=new ArrayList<Employee>();
		try(Connection con=ds.getConnection();
				PreparedStatement ps=con.prepareStatement(GET_EMPS_QUERY);){
				//set values to query param
				ps.setString(1,desg1);
				ps.setString(2,desg2);
				ps.setString(3,desg3);
				//execute sql query
				try(ResultSet rs=ps.executeQuery()){
					//copy each record of the obj to model class
					while(rs.next())
					{
						Employee emp=new Employee();
						emp.setEid(rs.getInt(1));
						emp.setEfname(rs.getString(2));
						emp.setElname(rs.getString(3));
						emp.setEsal(rs.getDouble(4));
						emp.setEaddress(rs.getString(5));
						list.add(emp);	
					}
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
