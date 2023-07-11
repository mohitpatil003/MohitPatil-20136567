package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Main extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			
			int sid = Integer.parseInt(request.getParameter("sid"));
			String sname = request.getParameter("sname");
			String phone = request.getParameter("phone");
			int marks = Integer.parseInt(request.getParameter("marks"));
			String branch = request.getParameter("branch");
			
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/igt_exam", "root", "1234");
			PreparedStatement p = c.prepareStatement("insert into student values(?, ?, ?, ?, ?)");
		
			p.setInt(1, sid);
			p.setString(2, sname);
			p.setString(3, phone);
			p.setInt(4, marks);
			p.setString(5, branch);
			
			p.execute();
			p.close();
			
			PrintWriter out = response.getWriter();
			out.print("<p>Congrats you are successfully registered</p>");
			RequestDispatcher rd = request.getRequestDispatcher("Main.html");
			rd.include(request, response);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}


}
