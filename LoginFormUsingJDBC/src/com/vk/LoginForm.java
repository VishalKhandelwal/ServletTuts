package com.vk;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginForm
 */
@WebServlet("/LoginForm")
public class LoginForm extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public LoginForm() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String name = request.getParameter("username");
		String password = request.getParameter("password");
         try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","HR", "hr");
			PreparedStatement pstm = con.prepareStatement("select * from EMP where name=? AND PASSWORD =?");
			pstm.setString(1, name);
			pstm.setString(2, password);
			ResultSet rs = pstm.executeQuery();
			if(rs.next())
			{
			  RequestDispatcher rd =request.getRequestDispatcher("WelcomeServlet");
			  rd.forward(request, response);
			}
			else
			{
				out.print("<h2 style=color:red;>Wrong Username or Password!!</h2>");
				RequestDispatcher rd = request.getRequestDispatcher("/index.html");
				rd.include(request, response);
			}
         } catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
         
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
