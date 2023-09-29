package in.pw.vaish.controller;

import java.io.IOException;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/test1")
public class ValidateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("pwd");
		
		if(username.equals("vaishnavi")&& password.equals("sharma")) {
			ServletContext context = getServletContext();
			RequestDispatcher rd = context.getRequestDispatcher("/inbox.jsp");
			rd.forward(request, response);
		}else {
			RequestDispatcher rd = request.getRequestDispatcher("./error.jsp");
			rd.forward(request, response);
			
		}

	}

}
