package com.vk;
import java.io.File;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * Application Lifecycle Listener implementation class FileLocationContextListener
 *
 */
@WebListener
public class FileLocationContextListener implements ServletContextListener {

    /**
     * Default constructor. 
     */
    public FileLocationContextListener() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent sce)  { 
         // TODO Auto-generated method stub
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent sce)  { 
    	//String rootPath = System.getProperty("catalina.home");
    	String rootPath = "F:\\";
    	System.out.println("rootPath"+rootPath);
    	ServletContext ctx = sce.getServletContext();
    	String relativePath = ctx.getInitParameter("tempfile.dir");
    	System.out.println("relativePath"+relativePath);
    	System.out.println("filepath"+rootPath + File.separator + relativePath);
    	File file = new File(rootPath + File.separator + relativePath);
    	if(!file.exists()) file.mkdirs();
    	System.out.println("File Directory created to be used for storing files");
    	ctx.setAttribute("FILES_DIR_FILE", file);
    	ctx.setAttribute("FILES_DIR", rootPath + File.separator + relativePath);
    }
	
}
