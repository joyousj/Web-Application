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

import com.dto.Player;

/**
 * Servlet implementation class BlackjackServlet
 */
@WebServlet("/BlackjackServlet")
public class BlackjackServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BlackjackServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//set response type
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String name = request.getParameter("name");
		Integer rounds = Integer.parseInt(request.getParameter("rounds"));
		
		//Request the session; session is the object
		HttpSession session = request.getSession(); 
		if(session != null) 
		session.setAttribute("name", name);
		session.setAttribute("rounds", rounds);
		
		if(Player.playerInfo(name, rounds) && (name != "" && rounds > 0)) {
			RequestDispatcher dispatcher = request.getRequestDispatcher("blackjackgame.jsp");
			dispatcher.forward(request, response);
			return;
		} else {
			out.print("<p style=\"color:red\">Please enter all fields to start the game!</p>");
			RequestDispatcher dispatcher = request.getRequestDispatcher("blackjack.jsp");
			dispatcher.include(request, response);
		}
		
		String title = "Joy's Game Center";
		String doctype = " <!doctype html public \"-//w3c//dtd html 4.0 " +
		                        "transitional//en\">\n";
			out.println("<html><head><link rel='sytlesheet' type='text/css' href='" + request.getContextPath() + "/style.css'/></head></html>");
			out.println( doctype + "<html><head><title>" + title + "</title></head><body>" + request.getParameter("name") 
					+ request.getParameter("rounds")  + request.getParameter("Play") + request.getParameter("End") + "</body></html>"
					);
			out.println("<html><head><link rel='sytlesheet' type='text/css' href='" + request.getContextPath() + "/style.css'/></head></html>");
			out.close();
		
		
	}

	
}
