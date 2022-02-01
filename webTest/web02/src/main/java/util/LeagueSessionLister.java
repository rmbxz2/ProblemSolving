package util;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
* Describe class here.
*
*
*
*
*
*/
public class LeagueSessionLister implements HttpSessionListener {

	@Override
	public void sessionCreated(HttpSessionEvent se) {
		System.out.println("ahmad , session  listener  created  ");
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent se) {
		System.out.println("listen , session  listener  destroyed  ");
	}

}
