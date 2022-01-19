package view;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.League;

/**
* Describe class here.
*
*
*
*
*
*/
public class ErrorPageServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ArrayList<String> errors = (ArrayList<String>) req.getAttribute("errors");
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<body>");
		for (String  error : errors) {
		    out.println(error);
		    out.println("<br>");
		}
		out.println("</body>");
		out.println("</html>");


	}
}
