package com.HelpForWarriors.dao;
import java.sql.*;

import com.HelpForWarriors.bean.SignUp;
import com.HelpForWarriors.util.DBconnection;

public class SignUpDao{
	public int save(SignUp signUp ) {
		int result=0;
		try {
			Connection  connection=DBconnection.dbConnection();
			PreparedStatement pst=connection.prepareStatement("insert into signup(name,gender,adharNo,mobileNo,email,accountNo,password)values(?,?,?,?,?,?,?)");
			pst.setString(1,signUp.getName() );
			pst.setString(2,signUp.getGender() );
			pst.setString(3, signUp.getAdharNo());
			pst.setString(4, signUp.getMobileNO());
			pst.setString(5, signUp.getEmail());
			pst.setString(6, signUp.getAccountNo());
			pst.setString(7, signUp.getPassword());
			result=pst.executeUpdate();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		 return result;
	}
	
  
}
