package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dto.Register;


/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String user = request.getParameter("userid");
		String password = request.getParameter("password");
		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		String email = request.getParameter("email");
		
		//httpSession Object; request the session
		HttpSession session = request.getSession();
		session.setAttribute("userid", user);
		session.setAttribute("password", password);
		session.setAttribute("fname", fname);
		session.setAttribute("lname", lname);
		session.setAttribute("email", email);

		
		if(Register.addUserInfo(user, password, fname, lname, email) 
			&& (user != "" && password != "" && fname != "" && lname != "" && email != "")) 
		{
			RequestDispatcher dispatcher = request.getRequestDispatcher("welcome.jsp");
			dispatcher.forward(request, response);
			return;
		} else {
			out.print("<p style=\"color:red\">Sorry all fields are required to login in!</p>");
			RequestDispatcher dispatcher = request.getRequestDispatcher("register.jsp");
			dispatcher.include(request, response);
		}
		
		String title = "Joy's Game Center";
		String doctype = " <!doctype html public \"-//w3c//dtd html 4.0 " +
	                        "transitional//en\">\n";
		out.println("<html><head><link rel='sytlesheet' type='text/css' href='" + request.getContextPath() + "/style.css'/></head></html>");
		out.println( doctype + "<html><head><title>" + title + "</title></head><body>" + request.getParameter("userid") 
				+ request.getParameter("password") + request.getParameter("fname") +  request.getParameter("lname") + request.getParameter("email") +
				request.getParameter("Submit") + "</body></html>"
				);
		out.println("<html><head><link rel='sytlesheet' type='text/css' href='" + request.getContextPath() + "/style.css'/></head></html>");
	
		
		
	
	}		
}
