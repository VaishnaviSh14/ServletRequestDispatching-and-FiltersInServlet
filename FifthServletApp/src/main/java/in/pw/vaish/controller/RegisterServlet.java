package in.pw.vaish.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    System.out.println("Request Processing phase...");
	 
	    String username = request.getParameter("username");
	    String usernumber = request.getParameter("usernumber");
	    String[] courses = request.getParameterValues("course");


	    PrintWriter out = response.getWriter();
	    out.println("<html>");
        out.println("<head>");
        out.println("<title>Registration Confirmation</title>");
        out.println("<style>");
        out.println("body { background-color: #f4f4f4; font-family: Arial, sans-serif; }");
        out.println("table { border-collapse: collapse; width: 60%; margin: 20px auto; }");
        out.println("th, td { padding: 10px; text-align: left; }");
        out.println("th { background-color: #00a64e; color: white; }");
        out.println("tr:nth-child(even) { background-color: #ddd; }");
        out.println("tr:hover { background-color: #ccc; }");
        out.println("</style>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h2>Registration Confirmation</h2>");
        out.println("<table border='1'>");
        out.println("<tr><th>Field</th><th>Value</th></tr>");
        out.println("<tr><td>Username</td><td>" + username + "</td></tr>");
        out.println("<tr><td>Contact Number</td><td>" + usernumber + "</td></tr>");
        
        if (courses != null) {
            for (String course : courses) {
                out.println("<tr><td>Course</td><td>" + course + "</td></tr>");
            }
        }
        
        out.println("</table>");
        out.println("</body>");
        out.println("</html>");
        out.close();
    }
}