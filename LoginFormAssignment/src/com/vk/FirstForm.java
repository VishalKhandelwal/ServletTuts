package com.vk;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FirstForm
 */
@WebServlet("/FirstForm")
public class FirstForm extends HttpServlet {
	private static final long serialVersionUID = 1L;

    
    public FirstForm() {
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		String name = request.getParameter("username");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		pw.println("Welcome "+name+"<br>"+"Your Emailis:"+email+"<br>"+"Your Password is:"+password);
		pw.close();
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
