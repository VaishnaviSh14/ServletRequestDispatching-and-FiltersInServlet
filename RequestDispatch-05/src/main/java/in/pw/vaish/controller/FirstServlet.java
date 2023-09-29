package in.pw.vaish.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/first")
public class FirstServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//Get the writer object to write the response
		PrintWriter out = response.getWriter();
		
		//writing the response
	
		out.println("<h1>Hello this is First Servlet</h1>");
		
		//Forwarding the request to second component
		RequestDispatcher rd =  request.getRequestDispatcher("./second");
		rd.include(request, response);

		out.println("<h1>Hello this is First Servlet Again....</h1>");

		
		out.close();
	
	}
	
	


}
