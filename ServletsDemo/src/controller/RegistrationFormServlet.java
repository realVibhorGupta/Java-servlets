package controller;

import java.sql.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class RegistrationFormServlet   
 */
@WebServlet("/reg")
public class RegistrationFormServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter out=response.getWriter();
		HttpSession hs=request.getSession();
		String fno=request.getParameter("fno");
		if(fno.equals("1"))
		{
			String name=request.getParameter("name");
			String mname=request.getParameter("mname");
			String fname=request.getParameter("fname");
			
			hs.setAttribute("name", name);
			hs.setAttribute("manme", mname);
			hs.setAttribute("fanme", fname);
			
			response.sendRedirect("./Form2.html");
			
		}
		if(fno.equals("2"))
		{
			String contact=request.getParameter("contact");
			String email=request.getParameter("email");
			String address=request.getParameter("address");
			
			hs.setAttribute("contact",contact);
			hs.setAttribute("email", email);
			hs.setAttribute("address", address);
			
			response.sendRedirect("./Form3.html");
			
		}
		if(fno.equals("3"))
		{
			String qual=request.getParameter("qual");
			String per=request.getParameter("per");
			
			
			String name=(String)hs.getAttribute("name");
			String mname=(String)hs.getAttribute("mname");
			String fname=(String)hs.getAttribute("fname");
			
			String contact =(String)hs.getAttribute("contact");
			String email=(String)hs.getAttribute("email");
			String address=(String)hs.getAttribute("address");
			
			
			
//			hs.setAttribute("qual",qual);
//			hs.setAttribute("per", per);
			
			try{
				
				Class.forName("com.mysql.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/adhaarregistration","root","");
				PreparedStatement ps=con.prepareStatement("insert into adharreg values(?,?,?,?,?,?,?,?)");
				ps.setString(1, name);
				ps.setString(2, mname);
				ps.setString(3, fname);
				ps.setString(4, contact);
				ps.setString(5, email);
				ps.setString(6, address);
				ps.setString(7, qual);
				ps.setString(8, per);
				
				int i=ps.executeUpdate();
				
				if(i!=0)
				{	
					out.println("<html><body style='font-family:monospace;background-color:yellow;text-align:center;text-size:40dp;'><table><tr>");
					out.println("<td>NAME=</td>"+name);
					out.println("MNAME="+mname);
					out.println("FAME="+fname);
					out.println("CONTACT="+contact);
					out.println("EMAIL="+email);
					out.println("ADDRESS="+address);
					out.println("QUALIFICATION="+qual);
					out.println("PERCENTAGE="+per);
					out.println("</body></html>");
				}else
				{
					out.println("REGITRATION FAILED");
				}
			}catch(Exception e)
			{
				e.printStackTrace();
			}
			response.sendRedirect("./Form3.html");
			
		}
	}

}
