package sl314.view;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sl314.model.League;

/**
* Describe class here.
*
*
*
*
*
*/
public class ListLeaguesServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<League> leagueList = new ArrayList<League>();
		leagueList.add(new League(2001, "spring", "first league"));
		leagueList.add(new League(2002, "summer", "second league"));
		leagueList.add(new League(2003, "winter", "third league"));
		leagueList.add(new League(2004, "fall", "fourth league"));
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<body>");
		for (League league : leagueList) {
			out.println(league.toString());
			out.println("</br>");
		}

		out.println("</body>");
		out.println("</html>");
	}
}
