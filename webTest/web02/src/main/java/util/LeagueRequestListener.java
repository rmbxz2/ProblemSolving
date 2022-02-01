package util;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

/**
* Describe class here.
*
*
*
*
*
*/
public class LeagueRequestListener implements ServletRequestListener {

	@Override
	public void requestDestroyed(ServletRequestEvent sre) {
		System.out.println("listen , servlet request   is destroyed");
	}

	@Override
	public void requestInitialized(ServletRequestEvent sre) {
		System.out.println("listen , servlet request   is Initilized");
	}

}
