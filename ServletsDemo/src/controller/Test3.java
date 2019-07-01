package controller;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;

/**
 * Application Lifecycle Listener implementation class Test3
 *
 */
@WebListener
public class Test3 implements ServletRequestListener {

   
	
	
	  public void requestInitialized(ServletRequestEvent arg0)  { 
	         // TODO Auto-generated method stub
		  
		  
		  System.out.println("for request init");
	    }
    public void requestDestroyed(ServletRequestEvent arg0)  { 
         // TODO Auto-generated method stub
    	 System.out.println("for request destroy");
    }

  
	
}
