package com.ahmed.mvc.controller;

import org.springframework.web.bind.annotation.RequestMapping;

// import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Describe class here.
 *
 *
 *
 *
 *
 */
public class UserController {

	/**
	*
	*
	*/
	@RequestMapping("/add")
    	public String addUser() {
		System.out.println("=============OK=========");
		return "";
	}
}
