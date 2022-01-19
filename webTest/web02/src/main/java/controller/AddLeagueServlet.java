package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
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
public class AddLeagueServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<String> errors = new ArrayList<String>();
		req.setAttribute("errors", errors);

		try {
			String yearStr = req.getParameter("year").trim();
			String title = req.getParameter("title").trim();
			String season = req.getParameter("season").trim();

			int year = -1;

			try {
				year = Integer.parseInt(yearStr);
			} catch (NumberFormatException e) {
				errors.add("year field must be a number ");
			}

			if ((year != -1) && ((year < 2000) || (year > 2010))) {
				errors.add("year must be between 2000-2010");
			}

			if (season.equalsIgnoreCase("UNKNOWN")) {
				errors.add("please select a season");
			}

			if (title.equals("")) {
				errors.add("please enter the title of league");
			}

			if (!errors.isEmpty()) {
				RequestDispatcher requestDispatcher = req.getRequestDispatcher("error_page.view");
				requestDispatcher.forward(req, resp);
				return;
			}

			League league = new League(year, season, title);
			req.setAttribute("league", league);
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("succes.view");
			requestDispatcher.forward(req, resp);
			return;

		} catch (Exception e) {
			errors.add(e.getMessage());
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("error_page.view");
			requestDispatcher.forward(req, resp);
		}
	}
}
