package com.vk;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Logger;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

/**
 * Servlet Filter implementation class LoginFilter
 */
@WebFilter("/LoginServlet")
public class LoginFilter implements Filter {

	private FilterConfig fConfig = null;

    /**
     * Default constructor. 
     */
    public LoginFilter() {
        // TODO Auto-generated constructor stub
 
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here
       PrintWriter out = response.getWriter();
       String remoteAddress =  request.getRemoteAddr();
       String uri = ((HttpServletRequest) request).getRequestURI();
       String protocol = request.getProtocol();

       chain.doFilter(request, response);
       fConfig.getServletContext().log("Logging Filter Servlet called");
       fConfig.getServletContext().log("**************************");
       fConfig.getServletContext().log("User Logged ! " +" User IP: " + remoteAddress +  " Resource File: " + uri + " Protocol: " + protocol);
		// pass the request along the filter chain
		
		
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
		this.fConfig = fConfig;
	}

}
