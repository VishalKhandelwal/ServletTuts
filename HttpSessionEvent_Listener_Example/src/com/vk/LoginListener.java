package com.vk;

import javax.servlet.ServletContext;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Application Lifecycle Listener implementation class LoginListener
 *
 */
@WebListener
public class LoginListener implements HttpSessionListener {

	ServletContext ctx=null;  
    static int total=0,current=0;  
    
    public LoginListener() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see HttpSessionListener#sessionCreated(HttpSessionEvent)
     */
    public void sessionCreated(HttpSessionEvent se)  { 

    	total++;  
        current++;  
          
        ctx=se.getSession().getServletContext();  
        ctx.setAttribute("totalusers", total);  
        ctx.setAttribute("currentusers", current);  
        System.out.println("Session is created");
        HttpSession session = se.getSession();  
        System.out.println("session id: " + session.getId());
        session.setMaxInactiveInterval(5);
          
    }

	/**
     * @see HttpSessionListener#sessionDestroyed(HttpSessionEvent)
     */
    public void sessionDestroyed(HttpSessionEvent se)  { 
    	
    	 current--;  
         ctx.setAttribute("currentusers",current); 
         System.out.println("Session is destroyed");
    }
	
}
