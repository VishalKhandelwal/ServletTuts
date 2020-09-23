package com.vk;

import java.sql.*;

public class RegisterDao {

	public static int save(String name,String email,String password,String gender,String dob,String addressLine,String city,String state,String country,String contact)
	{
		int status =0;
		Date sqlDob = Formatter.getSqlDate(dob);
		try {
			Connection con = ConProvider.getConnection();
			PreparedStatement pstm = con.prepareStatement("insert into company_mailer_user(name,email,password,gender,dob,addressLine,city,state,country,contact,registereddate,authorized) values(?,?,?,?,?,?,?,?,?,?,?,?)");
			pstm.setString(1, name);
			pstm.setString(2, email);
			pstm.setString(3, password);
			pstm.setString(4, gender);
			pstm.setDate(5, sqlDob);
			pstm.setString(6, addressLine);
			pstm.setString(7, city);
			pstm.setString(8, state);
			pstm.setString(9, country);
			pstm.setString(10, contact);
			pstm.setDate(11, Formatter.getCurrentDate());
			pstm.setString(12, "yes");
			
			status = pstm.executeUpdate();
			System.out.println("Status"+status);
		}
		catch (Exception e) {
			System.out.println(e);
		}
		
		return status;
	}
}
