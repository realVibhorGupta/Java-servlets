package controller;
import java.io.*;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Hello
 */
@WebServlet("/hello")
public class Hello extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		String name=request.getParameter("newname");
		
		PrintWriter out=response.getWriter();
		out.println("<html><body bgcolor=yellow>");
		out.println(name+" " +"you are damn sexy .....</body></html>");
		
		
		
	}

	

}
