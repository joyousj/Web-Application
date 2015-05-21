package com.dto;
//Register DTO Class-business logic

import java.sql.DriverManager;
import java.sql.Connection;

import com.mysql.jdbc.PreparedStatement;


public class Register {

	public static boolean addUserInfo(String user, String password, String fname, String lname, String email) {
		boolean status = true;
		Connection con = null;
		
		
		
		try {
			//Create mysql database connection
			String url = "jdbc:mysql://localhost:3306/test";
			String driver = "com.mysql.jdbc.Driver";
			String userName = "root";
			String pw = "";
			
			Class.forName(driver);
			con = DriverManager.getConnection(url, userName, pw);
			
			/*Create sql date object to be use in INSERT statement
			Calendar calendar = Calendar.getInstance();
			java.sql.Date startDate = new java.sql.Date(calendar.getTime().getTime());*/
			
			//Create String query statement
			String query = "insert into USERS (user_id, password, fname, lname, email)" + "values (?, ?, ?, ?, ?)";
			
			//Create mysql insert preparedStatement
			PreparedStatement pst = (PreparedStatement) con.prepareStatement(query);
			pst.setString(1, user);
			pst.setString(2, password);
			pst.setString(3, fname);
			pst.setString(4, lname);
			pst.setString(5, email);
			//Execute query statement
			//pst.execute();
			int i = pst.executeUpdate();
			if(i > 0)
				System.out.println("You are sucessfully registered..");
			 /*catch (Exception e2) {System.out.println(e2); }*/
		pst.close();
		con.close();
		}
		catch (Exception e) {
			System.err.println("Got an exception!");
			System.err.println(e.getMessage());
		}
		return status;
		
	}

}






