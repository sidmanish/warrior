package com.HelpForWarriors.servlet;


import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.HelpForWarriors.bean.*;
import com.HelpForWarriors.servlet.*;
import com.HelpForWarriors.dao.*;


@WebServlet("/SignUpServlet")
public class SignUpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
     
    public SignUpServlet() {
        super();
       
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
		
		
	}
	

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name=request.getParameter("name");
		String gender=request.getParameter("gender");
		String adharNo=request.getParameter("adharNo");
	    String  mobileNo= request.getParameter("moblieNo");

		String email =request.getParameter("email");
		String accountNo=request.getParameter("accountNo");
		String password=request.getParameter("password");
		
		SignUp signUp=new SignUp(name,gender,adharNo, mobileNo, email ,accountNo, password);
		SignUpDao signUpDao =new SignUpDao();
		int result= signUpDao.save(signUp);
		System.out.println(result);
		RequestDispatcher rd= request.getRequestDispatcher("login.jsp");
		rd.forward(request, response);
		
		
		
		
		
	}
	
	

}
