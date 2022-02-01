package util;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * Describe class InitilizedLeagues here.
 *
 *
 */

public class LeagueSevrvletContextListener implements ServletContextListener {

	// Implementation of javax.servlet.ServletContextListener

	/**
	 * 
	 *
	 * 
	 */
	public void contextInitialized(final ServletContextEvent servletContextEvent) {
		System.out.println("listen , context listener  Initilized  ");
	}

	/**
	 * 
	 *
	 * 
	 */
	public void contextDestroyed(final ServletContextEvent servletContextEvent) {
		System.out.println("listen , context listener  destroyed  ");
	}
}
