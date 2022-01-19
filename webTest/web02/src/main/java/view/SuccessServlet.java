package view;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
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
public class SuccessServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		League league = (League) req.getAttribute("league");
		String config = getInitParameter("leagueServletConfig");
		ServletContext context = getServletContext();
		String contextPorject = context.getInitParameter("contextForPorject");
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("succed league = " + league + "<br>");
		out.println("config   = " + config);
		out.println("<br>");
		out.println("context   = " + contextPorject);
		out.println("</body>");
		out.println("</html>");
	}
}
