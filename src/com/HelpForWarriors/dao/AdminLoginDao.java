package com.HelpForWarriors.dao;
import java.sql.*;
import com.HelpForWarriors.bean.AdminLogin;

import com.HelpForWarriors.bean.*;
import com.HelpForWarriors.util.*;

public class AdminLoginDao {

	public AdminLogin save(AdminLogin adminLogin) {
		AdminLogin login2=null;
		
		try {
			Connection connection = DBconnection.dbConnection();
			PreparedStatement pst = connection.prepareStatement("select * from adminlogin where userName =? and password = ?");
			pst.setString(1,adminLogin.getUserName());
			pst.setString(2,adminLogin.getPassward());
			ResultSet rs= pst.executeQuery();
			if(rs==null)
				return login2;
			else {
				while(rs.next()) {
					login2 = new AdminLogin();
				
				login2.setUserName(rs.getString("userName"));
				login2.setPassward(rs.getString("password"));
				
				return login2;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			return login2;
		}
		
		return login2;
		
	}

  }

