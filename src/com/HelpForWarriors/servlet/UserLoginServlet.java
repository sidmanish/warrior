package com.HelpForWarriors.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.HelpForWarriors.bean.*;
import com.HelpForWarriors.dao.*;


@WebServlet("/UserLoginServlet")
public class UserLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public UserLoginServlet() {
        super();
        
    }

		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("name");
		String password=request.getParameter("password");
		UserLogin userLogin=new UserLogin(name, password);
		UserLoginDao userLoginDao =new UserLoginDao();
		UserLogin result= userLoginDao.save(userLogin);
		System.out.println(result);
		RequestDispatcher rd= request.getRequestDispatcher("donates.jsp");
		rd.forward(request, response);
		
		
	}

}
