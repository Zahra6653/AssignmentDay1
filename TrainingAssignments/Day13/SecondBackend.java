package com.day12;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Cookie;

/**
 * Servlet implementation class SecondBackend
 */
@WebServlet("/second")
public class SecondBackend extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("application/pdf");
		PrintWriter out = response.getWriter();
		out.print("This is second page<br>");
		Cookie ck[] = request.getCookies();
		for(int i=0;i<ck.length;i++) {
			out.print("Your name is: " + ck[i].getValue());
		    
		}
	}

	

}
