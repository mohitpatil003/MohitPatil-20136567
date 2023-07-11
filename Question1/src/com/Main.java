package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {

	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/igt_exam", "root", "1234");
			Statement s = c.createStatement();
			
			ResultSet r = s.executeQuery("select * from employee");
			
			while(r.next()) {
				System.out.println(r.getInt(1) + ":" + r.getString(2) + ":" + r.getInt(3) + ":" + r.getInt(4) + ":" + r.getString(5));
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
