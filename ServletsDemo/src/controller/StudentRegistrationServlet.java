package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class StudentRegistrationServlet
 */
@WebServlet("/stdreg")
public class StudentRegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentRegistrationServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		int marks=Integer.parseInt(request.getParameter("marks"));
		
		
		PrintWriter out=response.getWriter();
		
		
		out.println("NAME:"+name);
		out.println("EMAIL:"+email);
		out.println("MARKS:"+marks);
		
		
		
		
		
	}

	
}
