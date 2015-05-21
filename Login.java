package com.dto;
//Login DTO Class-business logic

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;
import com.mysql.jdbc.PreparedStatement;


public class Login {
	
	public static boolean validate(String user, String password) {
		boolean status = false;
		Connection con = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		
		String url = "jdbc:mysql://localhost:3306/test";
		String driver = "com.mysql.jdbc.Driver";
		String userName = "root";
		String pw = "";
	
	
	
	try {
	Class.forName(driver).newInstance();
	con = DriverManager.getConnection(url, userName, pw);
	pst = (PreparedStatement) con.prepareStatement("select * from USERS where user_id=? and password=?");
	pst.setString(1, user);
	pst.setString(2, password);
	rs = pst.executeQuery();
	status = rs.next();
	/*if(rs.next()) {
		if(rs.getString(2).equals("password"))
	
	{
		System.out.println("Welcome" + "userid");
	
	}
		else {
		System.out.println("Invalid password! Please try again!");
		}
	}*/
	} catch (Exception e) {
		System.out.println(e);
	} finally {
		if (con != null) {
			try{
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if (pst != null) {
			try {
				pst.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
		if (rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return status;
	}
	
}
