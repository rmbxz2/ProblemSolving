package view;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
* Describe class here.
*
*
*
*
*
*/
public class LeagueError extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ArrayList<String> leagueErrors = (ArrayList<String>) req.getAttribute("leagueErrors");
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<body>");
		for (String  error : leagueErrors) {
		    out.println(error);
		    out.println("<br>");
		}
		out.println("</body>");
		out.println("</html>");
	}
}
