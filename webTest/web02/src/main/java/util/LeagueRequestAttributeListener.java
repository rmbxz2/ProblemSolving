package util;

import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;

/**
* Describe class here.
*
*
*
*
*
*/
public class LeagueRequestAttributeListener implements ServletRequestAttributeListener {

	@Override
	public void attributeAdded(ServletRequestAttributeEvent srae) {
		System.out.println("listen , request attribue added to request scope  " + srae.getName() + srae.getValue());
	}

	@Override
	public void attributeRemoved(ServletRequestAttributeEvent srae) {
		System.out.println("listen , request attribue removed  to request scope  " + srae.getName() + srae.getValue());
	}

	@Override
	public void attributeReplaced(ServletRequestAttributeEvent srae) {
		System.out.println("listen , request attribue replaced to request scope  " + srae.getName() + srae.getValue());
	}

}
