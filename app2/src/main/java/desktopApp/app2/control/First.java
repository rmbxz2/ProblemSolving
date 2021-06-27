package desktopApp.app2.control;

import desktopApp.app2.model.League;

/**
 * Describe class First here.
 *
 *
 * Created: Mon Sep 18 16:15:17 2017
 *
 * @author <a href="mailto:root@localhost.localdomain">root</a>
 * @version 1.0
 */
public class First {

    	public static void main(String[] args) {
	    League league = new League("Ahmed","99","male");
	    	System.out.println("desktop App 1 tested by magit git ant emacs linux and shell command ");
		System.out.println("league name =  "+ league.getName());
		System.out.println("league age =  "+ league.getAge());
		System.out.println("league gender =  "+ league.getGender());
	}
}
