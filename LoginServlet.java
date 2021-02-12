package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public LoginServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		ServletContext sc = getServletContext();
		String name = sc.getInitParameter("username");
		String pass = sc.getInitParameter("password");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		System.out.println("username : " + name + "  password : " + password);
		
		if(username.equalsIgnoreCase(name) && password.equals(pass)) {
			out.println("<body text = 'white'>");
			out.println("<h2><center>Login Sucess!</center></h2>");
			out.println("</body>");
			RequestDispatcher rd = request.getRequestDispatcher("/home.html");
			rd.forward(request, response);
			//System.out.println("username : " + name + "  password : " + password);
		}
		else {
			out.println("<body text = 'white'>");
			out.println("<h2><center>Invalid Credentials!</center></h2>");
			out.println("</body>");
				RequestDispatcher rd=request.getRequestDispatcher("/SignIn.html");
				rd.include(request, response);
			
		
		}
		out.close();
	



	}

}
