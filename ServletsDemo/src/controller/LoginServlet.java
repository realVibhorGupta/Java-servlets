package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		response.setContentType("text/html");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		session.setAttribute("username", username);
		session.setAttribute("password", password);

		PrintWriter out = response.getWriter();

		out.println("<html>");
		out.println("<h1>LOGIN SUCCESS</h1>");
		out.println("<head><a href='./logout'>LOGOUT</a></head><body></body></html>");
	}
}
