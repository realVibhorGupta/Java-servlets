package controller;

import java.sql.*;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegistrationServlet
 */
@WebServlet("/reg1")
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		System.out.println(" NEXT SERVLET EXECUTION");
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		String address=request.getParameter("address");
		
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ServletsDemo","root","");
			PreparedStatement ps=con.prepareStatement("insert into student values ?,?,? ");
			
			ps.setString(1, name);
			ps.setString(2, email);
			ps.setString(3, address);
			int i=ps.executeUpdate();
			
			if(i!=0)
			{
			out.println("SUCCESS");
			}
			else
			{
				out.println("FAIL");
			
			}
}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	
}
