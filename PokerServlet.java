package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PokerServlet
 */
@WebServlet("/PokerServlet")
public class PokerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PokerServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//set response content type
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		String title = "Joy's Game Center";
		String doctype = " <!doctype html public \"-//w3c//dtd html 4.0 " +
                "transitional//en\">\n";
		out.println("<html><head><link rel='sytlesheet' type='text/css' href='" + request.getContextPath() + "/style.css'/></head></html>");
		out.println(doctype + "<html><head><title>" + title + "</title></head><body>" + request.getParameter("name") + request.getParameter("players")
				+ request.getParameter("ante") + request.getParameter("wallet") + request.getParameter("Play") + request.getParameter("End")
				+ "</body></html>"
				);
		out.println("<html><head><link rel='sytlesheet' type='text/css' href='" + request.getContextPath() + "/style.css'/></head></html>");

		
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	/*protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}*/

}
