package com.asu.ser515.controller;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Controller class to handle the login functionality of the application. It will authenticate the
 * user and redirect to their respective web pages. 
 * 
 * @author amanjotsingh
 * @date 09/25/2019
 * 
 * */

@SuppressWarnings("serial")
public class LoginServlet extends HttpServlet {
	
	private String adminPage = "admin.html";
	
	public void init(ServletConfig config) throws ServletException { 
    	super.init(config);
   	}
	
	// doPost method to handle form submit coming from web page
	public void doPost(HttpServletRequest req, HttpServletResponse res) {
//        String password = req.getParameter("password");
//        String userName = req.getParameter("userName");
        try {
			req.getRequestDispatcher(adminPage).forward(req, res);
		} catch (IOException ioExc) {
			ioExc.printStackTrace();
		} catch (ServletException servletExc) {
			servletExc.printStackTrace();
		}
	}
}