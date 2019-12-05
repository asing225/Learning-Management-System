package com.asu.ser515.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.asu.ser515.model.Grade1Student;
import com.asu.ser515.model.Question;
import com.asu.ser515.model.Quiz;
import com.asu.ser515.model.User;
import com.asu.ser515.services.helper.StudentServletHelper;
import com.asu.ser515.services.impl.DBConnServiceImpl;

/**
 * @author Kushagr Jolly
 * Nov 8, 2019
 */
@SuppressWarnings("serial")
public class StudentServlet extends HttpServlet {
	private int quiz_id;
	
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
	}
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) {
		quiz_id = Integer.parseInt(req.getParameter("id"));
		HttpSession session = req.getSession(false);
		User student = new Grade1Student();
		student.setFirstName((String) session.getAttribute("firstname"));
		student.setLastName((String) session.getAttribute("lastname"));
		student.setUserName((String) session.getAttribute("username"));
		student.setUser_Id((int) session.getAttribute("u_id"));
		student.setUserType((int) session.getAttribute("usertype"));
		DBConnServiceImpl serviceImpl = new DBConnServiceImpl();
		List<String>[] questionEntry = serviceImpl.quizQuestionJsonExtraction(quiz_id);
		List<String> question = questionEntry[0];
		List<String> solution = questionEntry[1];
		Question questionSet = new Question();
		questionSet.setQuestion(question.get(0));
		session.setAttribute("Questions", question);
		session.setAttribute("Answers", solution);
		StudentServletHelper studentServletHelper = new StudentServletHelper();
		String userPage = studentServletHelper.mapUserToPage(student.getUserType());		
		try {
			getServletContext().getRequestDispatcher(userPage).forward(req,res);
		} catch (ServletException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void doPost(HttpServletRequest req, HttpServletResponse res) {
		try {
			System.out.println("132424");
			getServletContext().getRequestDispatcher("/studentLandingPage.jsp").forward(req, res);
		} catch (IOException ioExc) {
			ioExc.printStackTrace();
		} catch (ServletException servletExc) {
			servletExc.printStackTrace();
		}
	}
	
	

}
