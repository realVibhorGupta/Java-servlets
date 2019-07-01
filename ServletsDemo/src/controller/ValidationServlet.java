package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ValidationServlet
 */
@WebServlet("/reg1")
public class ValidationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		String address=request.getParameter("address");
		
		
		PrintWriter out=response.getWriter();
		boolean b=false;
		
		if(name.equals(""))
		{
			out.println("NAME IS REQUIRED");
			b=false;
		}
		if(email.equals(""))
		{
			out.println("EMAIL IS REQUIRED");
			b=false;
		}
		if(address.equals(""))
		{
			out.println("ADDRESS IS REQUIRED");
			b=false;
		}
		else
		{
			b=true;
		}
		if(b==true)
		{
			System.out.println("FORWARD TO NEXT");
		RequestDispatcher rd=request.getRequestDispatcher("/next");
		rd.forward(request, response);
		}else
		{
			
		}
	}

	
}
