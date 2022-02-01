package util;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;

/**
* Describe class here.
*
*
*
*
*
*/
public class LeagueServletContextAttributeListener implements ServletContextAttributeListener {

	@Override
	public void attributeAdded(ServletContextAttributeEvent event) {
		System.out.println("listen , context attribue listener  added  ");
	}

	@Override
	public void attributeRemoved(ServletContextAttributeEvent event) {
		System.out.println("listen , context attribue listener  removed  ");
	}

	@Override
	public void attributeReplaced(ServletContextAttributeEvent event) {
		System.out.println("listen , context attribue listener  replaced  ");
	}

}
