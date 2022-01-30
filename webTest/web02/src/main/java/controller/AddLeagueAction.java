package controller;
 
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import exception.DaoException;
import model.League;
import service.LeagueService;

/**
* Describe class here.
*
*
*
*
*
*/
public class AddLeagueAction extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<String> leagueErrors = new ArrayList<String>();
		req.setAttribute("leagueErrors", leagueErrors);

		try {
			String yearStr = req.getParameter("year").trim();
			String title = req.getParameter("title").trim();
			String season = req.getParameter("season").trim();

			int year = -1;

 			try {
				year = Integer.parseInt(yearStr);
			} catch (NumberFormatException e) {
				leagueErrors.add("year field must be a number ");
			}

			if ((year != -1) && ((year < 2000) || (year > 2010))) {
				leagueErrors.add("year must be between 2000-2010");
			}

			if (season.equalsIgnoreCase("UNKNOWN")) {
				leagueErrors.add("please select a season");
			}

			if (title.equals("")) {
				leagueErrors.add("please enter the title of league");
			}

			if (! leagueErrors.isEmpty()) {
				RequestDispatcher requestDispatcher = req.getRequestDispatcher("League_error.view");
				requestDispatcher.forward(req, resp);
				return;
			}

			League league = new League(year, season, title);
			try {
				LeagueService leagueService = new LeagueService();
				leagueService.createLeague(league);
			} catch (DaoException e) {
				throw new DaoException(e);
			}
			req.setAttribute("league", league);
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("League_succes.view");
			requestDispatcher.forward(req, resp);
			return;
		} catch (Exception e) {
		    leagueErrors.add(e.getMessage()); 
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("League_error.view");
			requestDispatcher.forward(req, resp);
		}
	}
}
