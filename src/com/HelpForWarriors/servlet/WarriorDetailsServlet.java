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
import com.HelpForWarriors.servlet.*;

 @WebServlet("/WarriorDetailsServlet")
public class WarriorDetailsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public WarriorDetailsServlet() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		doPost(request,response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name=request.getParameter("name");

		String rank=request.getParameter("rank");
		String address=request.getParameter("address");
		String martyrDate=request.getParameter("martyrDate");
		WarriorDetails warriorDetails=new WarriorDetails(name,rank,address,martyrDate);
		WarriorDetailsDao warriorDetailsDao=new WarriorDetailsDao();
		int result= warriorDetailsDao.save(warriorDetails);
		System.out.println(result);
		RequestDispatcher rd= request.getRequestDispatcher("donates.jsp");
		rd.forward(request, response);
		
	}

}
