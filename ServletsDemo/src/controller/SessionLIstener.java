package controller;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Application Lifecycle Listener implementation class SessionLIstener
 *
 */
@WebListener
public class SessionLIstener implements HttpSessionListener {

    public void sessionCreated(HttpSessionEvent arg0)  { 
    	
    	System.out.println("on session creation");
    }

    public void sessionDestroyed(HttpSessionEvent arg0)  { 
         // TODO Auto-generated method stub
    	
    	System.out.println("on session invalidate");
    }
	
}
