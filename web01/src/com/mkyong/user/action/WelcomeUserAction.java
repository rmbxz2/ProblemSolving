package com.mkyong.user.action;

/**
* 
*
*/
public class WelcomeUserAction {

	private String username;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	// all struts logic here
	public String execute() {
		if (username.equals("Ahmed")) {
			return "SUCCESS";
		} else {
			return "ERROR";
		}
	}
}