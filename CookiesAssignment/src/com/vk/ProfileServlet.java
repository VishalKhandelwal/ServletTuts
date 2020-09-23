package com.vk;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ProfileServlet
 */
@WebServlet("/ProfileServlet")
public class ProfileServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProfileServlet() {
        super();
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
		
		Cookie ck[] = request.getCookies();
		if(ck != null)
		{
			String name = ck[0].getValue();
			 if(!name.equals("")||name!=null){  
		      //      out.print("<b>Welcome to Profile</b>");  
		     //       out.print("<br>Welcome, "+name);  
		          
		
		
		
		out.print("<!DOCTYPE html><html><head><meta charset='utf-8'><meta name='viewport' content='width=device-width, initial-scale=1'>"
 + "<link rel='stylesheet' href='https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css'>"
 + " <script src='https://ajax.googleapis.com/ajax/libs/jquery/3.4.0/jquery.min.js'></script>"
	 + " <script src='https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js'></script>"
		 + " <script src='https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js'></script>"

			 + "<link rel='stylesheet' href='https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css'><style>"
+ ".card { box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2); max-width: 300px;  margin: auto;  text-align: center;  font-family: arial;}"

+ ".title {  color: grey;  font-size: 18px;}"

+ "button {  border: none;  outline: 0;  display: inline-block;  padding: 8px;  color: white; background-color: #000;  text-align: center;  cursor: pointer;  width: 100%;  font-size: 18px;}"

+ "a {  text-decoration: none;  font-size: 22px;  color: black;}"

+ "button:hover, a:hover {  opacity: 0.7;}</style></head>"
+ "<body> <nav class='navbar navbar-expand-md bg-dark navbar-dark'> <a class='navbar-brand' href='#'>Navbar</a>"
+ "  <button class='navbar-toggler' type='button' data-toggle='collapse' data-target='#collapsibleNavbar'>"
+ "  <span class='navbar-toggler-icon'></span>"
+ " </button>"
+ " <div class='collapse navbar-collapse' id='collapsibleNavbar'>"
+ "   <ul class='navbar-nav'>"
+ "     <li class='nav-item'>"
+ "       <a class='nav-link' href='Login.html'>Login</a>  </li> <li class='nav-item'>"
+ "       <a class='nav-link' href='LogoutServlet'>Logout</a> </li><li class='nav-item'>"
+ "       <a class='nav-link' href='ProfileServlet'>Profile</a></li></ul></div></nav>"
+ "<h2 style='text-align:center'>User Profile Card</h2><div class='card'>"
+ " <img src='Images/team2.jpg' alt='John' style='width:100%'>"
+ " <h1>"+name+"</h1>"
+ "  <p class='title'>CEO & Founder, Example</p>"
+ "  <p>Harvard University</p>"
 + " <div style='margin: 24px 0;'>"
 + "   <a href='#'><i class='fa fa-dribbble'></i></a>" 
 + "  <a href='#'><i class='fa fa-twitter'></i></a>"  
 + "  <a href='#'><i class='fa fa-linkedin'></i></a>" 
 + "  <a href='#'><i class='fa fa-facebook'></i></a>"
 + " </div>"
 + " <p><button>Contact</button></p></div></body></html>");
			 }
		}
		else {
			out.print("Please login first");  
            request.getRequestDispatcher("Login.html").include(request, response); 
		}
		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
