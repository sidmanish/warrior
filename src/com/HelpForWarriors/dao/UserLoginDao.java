package com.HelpForWarriors.dao;
import java.sql.*;
import com.HelpForWarriors.bean.*;
import com.HelpForWarriors.util.DBconnection;


public class UserLoginDao {
  public UserLogin save(UserLogin userLogin) {
	  UserLogin login2=null;
	  try {
		  Connection  connection=DBconnection.dbConnection();
			PreparedStatement pst=connection.prepareStatement("select*from signup where username=? and password=?");
			pst.setString(1,userLogin.getName() );
			pst.setString(2,userLogin.getPassword() );
			ResultSet rs=pst.executeQuery();
			if(rs==null)
				return login2;
			else {
				while(rs.next()) {
					login2 = new UserLogin();
				login2.setId(rs.getInt("id"));
				login2.setName(rs.getString("name"));
				login2.setPassword(rs.getString("password"));
				
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