package controller;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * Application Lifecycle Listener implementation class Test1
 *
 */
@WebListener
public class Test1 implements ServletContextListener {

    public void contextInitialized(ServletContextEvent sce)
    { 
    	System.out.println("context init");
    }
	
    public void contextDestroyed(ServletContextEvent sce)  
    { 
    	System.out.println("context destroy");
    }

   
	
}
