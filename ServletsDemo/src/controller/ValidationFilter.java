package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 * Servlet Filter implementation class ValidationFilter
 */
@WebFilter("/stdreg")
public class ValidationFilter implements Filter {

    
	
	
    public ValidationFilter() {
    		
    }
    public void init(FilterConfig fConfig) throws ServletException {
    	
    //	fConfig.getInitParameter("key");
    	
    	
    	
    	
    	
	}

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
	
    	PrintWriter out=response.getWriter();	
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		int marks = 0;
		try{
		 marks=Integer.parseInt(request.getParameter("marks"));
		}catch(Exception e){
			
			e.printStackTrace();
		}
		
		  
		if(name.equals(""))
		{
			
			
			out.println("NAME IS REQUIRED: ");	
			
			
		}
		
		else if(email.equals(""))
		{
			out.println("EMAIL IS REQUIRED:");
		}
		
		else if(marks == 0)
		{
			 
			out.println("MARKS ARE REQUIRED:");	
			
		}
		else
		{	out.println("<html><body style='font-color:red;text-align:center;background-color:yellow;'><pre>");
			chain.doFilter(request, response);
			
			out.println("ooooooo vibhor is so sexy...");
			out.println("</pre></body></html>");
			
		}
	}

	
	public void destroy() {
	
		
		
			System.out.println("FIlter DEstroy");
	}

	
	

}
