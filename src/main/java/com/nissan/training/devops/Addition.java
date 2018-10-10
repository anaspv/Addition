package com.nissan.training.devops;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Addition")

public class Addition extends HttpServlet {

	private static final long serialVersionUID = 1L;
	PrintWriter out;    
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		out= response.getWriter(); 
		String n1=(request.getParameter("nmbr1"));
		String n2=(request.getParameter("nmbr2"));
		out.println("Sum is : "+printAdd(n1,n2));
		
	}

	private String printAdd(String n1, String n2) {
		
		try {
			float nm1=Float.parseFloat(n1);
			float nm2=Float.parseFloat(n2);
			float res=nm1+nm2;
			return (Float.toString(res));
		}catch(Exception e) {
			return("Invalid");
		}
		
	}
	
	
}
