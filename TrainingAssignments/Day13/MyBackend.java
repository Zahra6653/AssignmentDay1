package com.day12;

import java.io.IOException;
import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Cookie;

/**
 * Servlet implementation class MyBackend
 */
@WebServlet("/MyFormBackend")
public class MyBackend extends HttpServlet {
	private static final long serialVersionUID = 1L;

    
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Hello you have called server");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("hello this is server");
		String name = request.getParameter("user");
		int age= Integer.parseInt(request.getParameter("age"));
		
		out.print("<br>Your name is : " + name +  "<br>");
		out.print("Your age is : " + age +  "<br>");
		if(age>=18)
			out.print("You can vote<br>");
		else
			out.print("You cannot vote<br>");
		Cookie cookie = new Cookie("Mykey1",name);
	
		response.addCookie(cookie);
		out.print("<a href='second'> go to second page </a>");
	}

	
	
}
