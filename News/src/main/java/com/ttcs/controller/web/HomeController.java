package com.ttcs.controller.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ttcs.model.UserModel;


@WebServlet(urlPatterns = {"/trang-chu"})
public class HomeController extends HttpServlet{
	private static final long serialVersionUID = 2686801510274002166L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		UserModel  userModel = new UserModel();
		userModel.setFullName("Hello");
		request.setAttribute("model", userModel);
         RequestDispatcher rd = request.getRequestDispatcher("./decorators/web.jsp");
         rd.forward(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}
}
