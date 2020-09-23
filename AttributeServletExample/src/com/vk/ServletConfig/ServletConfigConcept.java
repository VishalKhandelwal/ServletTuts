package com.vk.ServletConfig;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletConfigConcept
 */
@WebServlet(
		urlPatterns = {"/ServletConfigConcept"}, 
		initParams = { 
				@WebInitParam(name = "driver", value = "sun.jdbc.driver.OracleDriver"),
				@WebInitParam(name = "password", value = "Ashwani"),
				@WebInitParam(name = "schema", value = "Teacher")
		})
public class ServletConfigConcept extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletConfigConcept() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		
		ServletConfig config = getServletConfig();
		Enumeration<String> e = config.getInitParameterNames();
		
		
		
		while(e.hasMoreElements()) {
			String s = "";
			s+=e.nextElement();
			
			pw.print("<html><body>");
			pw.print("<br>Name: "+s);
			pw.print("<br>Value: "+ config.getInitParameter(s)+"<hr>");
			pw.print("</body></html>");
		}
		
		pw.close();
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
