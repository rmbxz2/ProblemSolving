package webServlet.control;

import java.util.ArrayList;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import webServlet.Dao.LeagueDao;
import webServlet.exception.DaoException;
import webServlet.model.League;

// import org.apache.struts.action.Action;
// import org.apache.struts.action.ActionForm;
// import org.apache.struts.action.ActionForward;
// import org.apache.struts.action.ActionMapping;
// import org.apache.struts2.dispatcher.filter.StrutsPrepareAndExecuteFilter;

/**
 * Describe class AddLeagueAction here.
 *
 *
 *
 *
 *
 *
 */
public class AddLeagueAction {

	private static final long serialVersionUID = -1054594268958923535L;

	/**
	 * 
	 *
	 * 
	 */

	public final String execute() throws Exception {
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpServletResponse response = ServletActionContext.getResponse();
		ServletContext context = request.getServletContext();
		ArrayList<League> leagueList = (ArrayList<League>) context.getAttribute("leagueList");// leagueList form

		ArrayList<String> errors = new ArrayList<String>();
		request.setAttribute("errors", errors);
		try {
			String yearString = request.getParameter("year").trim();
			String title = request.getParameter("title").trim();
			String season = request.getParameter("season").trim();
			int year = -1;
			try {
				year = Integer.parseInt(yearString);
			} catch (NumberFormatException e) {
				errors.add("year must be a number");
			}
			if (year != -1 && (year < 2005 || year > 2010)) {
				errors.add("please enter year between 2005-2010");
			}
			if (title.equalsIgnoreCase("")) {
 				errors.add("please enter title ");
			}
			if (season.equalsIgnoreCase("Unknown")) {
				errors.add("please enter season");
			}
			if (leagueList == null) {
				errors.add("can't add new league to leagueList because it is a null ");
			}
			if (! errors.isEmpty()) {
				return "ERROR";
			} else {
				League league = new League(year, title, season);
				request.setAttribute("league", league);
				leagueList.add(league); // leagueList have file.txt and user input
				// System.out.println(league.getSeason());
				//
				//
				try {
					LeagueDao leagueDao = new LeagueDao();
					// League league = new League(2008,"DAO 1","Spring");
					leagueDao.addLeague(league);
				} catch (ClassNotFoundException e) {
					// errors.add(e.getMessage());
					// return "ERROR";
					throw new DaoException(e);
				}
				//
				// (semantic-describe-tag )
				return "SUCCESS";
				// return "success";
			}
		} catch (Exception e) {
			errors.add(e.getMessage());
			return "ERROR";
		}
	}
}
