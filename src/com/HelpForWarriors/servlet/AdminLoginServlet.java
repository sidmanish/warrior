package com.HelpForWarriors.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.HelpForWarriors.bean.AdminLogin;
import com.HelpForWarriors.dao.AdminLoginDao;


@WebServlet("/AdminLoginServlet")
public class AdminLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public AdminLoginServlet() {
        super();
            }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doPost(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userName=request.getParameter("userName");
		String password=request.getParameter("password");
		AdminLogin adminLogin=new AdminLogin(userName, password);
		AdminLoginDao adminLoginDao =new AdminLoginDao();
		AdminLogin result= adminLoginDao.save(adminLogin);
		System.out.println(result);
		RequestDispatcher rd= request.getRequestDispatcher("warriorDetails.jsp");
		rd.forward(request, response);
		
		
	}

}
