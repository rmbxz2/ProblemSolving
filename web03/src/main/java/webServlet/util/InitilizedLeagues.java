package webServlet.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import webServlet.model.League;

/**
 * Describe class InitilizedLeagues here.
 *
 *
 */

public class InitilizedLeagues implements ServletContextListener {

	// Implementation of javax.servlet.ServletContextListener

	/**
	 * 
	 *
	 * 
	 */
	public void contextInitialized(final ServletContextEvent servletContextEvent) {
		ArrayList<League> leagueList = new ArrayList<League>();
		ServletContext context = servletContextEvent.getServletContext();
		String leagueFile = context.getInitParameter("leagueFile");
		context.log("leagueFile value = " + leagueFile);
		InputStream is = null;
		BufferedReader reader = null;
		try {
			is = context.getResourceAsStream(leagueFile);
			reader = new BufferedReader(new InputStreamReader(is));
			String record;
			while ((record = reader.readLine()) != null) {
				String[] fields = record.split("\t");
				context.log("ahmad reading leaugeFile line " + fields);
				int year = Integer.parseInt(fields[0]);
				String title = fields[1];
				String season = fields[2];
				League league = new League(year, title, season);
				leagueList.add(league);
			}
			if (leagueList.isEmpty()) {
				context.log("leagueList is empty ");
			}
			context.setAttribute("leagueList", leagueList);
			// log into /home/jdee_workspace/sourcePathx/servers/tomcat9/logs/localhost.2019-12-30.log
			context.log("leagueList has been loaded");
		} catch (IOException e) {
			context.log("exception occured while reading  the league file ", e);
		} catch (Exception e) {
			context.log("ahmad exception occured while processing  the league file ", e);
		} finally {
			if (is != null) {
				try {
					is.close();
				} catch (Exception e) {
					context.log("exception can't close inputStream is in   league file ", e);
				}
			}
			if (reader != null) {
				try {
					reader.close();
				} catch (Exception e) {
					context.log("exception can't close reader.close  league file ", e);
				}
			}
		}
	}

	/**
	 * 
	 *
	 * 
	 */
	public void contextDestroyed(final ServletContextEvent servletContextEvent) {

	}
}
