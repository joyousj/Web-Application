package com.controller;
//Controller page
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dto.Login;




/**
 * Servlet implementation class IndexServlet
 */
@WebServlet("/IndexServlet")
public class IndexServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public IndexServlet() {
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
	
	
	HttpSession session = request.getSession();//httpSession Object; request the session
	if (session != null)
	session.setAttribute("userid", user);
	session.setAttribute("password", password);
	
	if (Login.validate(user, password) && (user != "" && password != "")) {
		//use RequestDispatcher to redirect to welcome page; welcome.jsp does not make another request
		RequestDispatcher dispatcher = request.getRequestDispatcher("welcome.jsp");
		dispatcher.forward(request, response);
		return;
	} else {
		out.print("<p style=\"color:red\">Sorry username or password is incorrect!</p>");
		RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
		dispatcher.include(request, response);
	}
	
	
	String title = "Joy's Game Center";
	String doctype = " <!doctype html public \"-//w3c//dtd html 4.0 " +
	                        "transitional//en\">\n";
		out.println("<html><head><link rel='sytlesheet' type='text/css' href='" + request.getContextPath() + "/style.css'/></head></html>");
		out.println( doctype + "<html><head><title>" + title + "</title></head><body>" + request.getParameter("userid") 
				+ request.getParameter("password")  + request.getParameter("login") + "</body></html>"
				);
		out.println("<html><head><link rel='sytlesheet' type='text/css' href='" + request.getContextPath() + "/style.css'/></head></html>");
		out.close();
		
		
	}

}
