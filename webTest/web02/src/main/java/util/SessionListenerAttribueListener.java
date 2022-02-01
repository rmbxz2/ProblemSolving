package util;

import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

/**
* Describe class here.
*
*
*
*
*
*/
public class SessionListenerAttribueListener implements HttpSessionAttributeListener {

	@Override
	public void attributeAdded(HttpSessionBindingEvent event) {
		System.out.println("listen , session attribue added to session    " + event.getName() + event.getValue());
	}

	@Override
	public void attributeRemoved(HttpSessionBindingEvent event) {
		System.out.println("listen , session attribue removed to session    " + event.getName() + event.getValue());
	}

	@Override
	public void attributeReplaced(HttpSessionBindingEvent event) {
		System.out.println("listen , session attribue replaced to session    " + event.getName() + event.getValue());
	}

}
