package com.resteasy;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/form"})

public class form extends HttpServlet{
	private static final long serialVersionUID = 1L;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter pw = resp.getWriter();
		
		pw.println("<html><body align='center'>");  
		pw.println("<h1>Registeration Form</h1>");  
		pw.print("<form action='test/create' method='post' > ");
		pw.println("<input type='text' name='id' placeholder='Id'> <br> ");
		pw.println("<input type='text' name='fname' placeholder='First Name'> <br> ");
		pw.println("<input type='text' name='lname' placeholder='Last Name'> <br> ");
		pw.println("<input type='text' name='city' placeholder='City'> <br> ");
		pw.println("<input type='submit' name='submit'>");
		pw.print("</form>");
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
