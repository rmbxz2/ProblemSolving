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
public class PlayerError extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ArrayList<String> playerErrors = (ArrayList<String>) req.getAttribute("playerErrors");
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<body>");
		for (String error : playerErrors) {
			out.println(error);
			out.println("<br>");
		}
		out.println("</body>");
		out.println("</html>");

	}
}
