package com.HelpForWarriors.dao;
import java.sql.*;

import com.HelpForWarriors.bean.SignUp;
import com.HelpForWarriors.bean.WarriorDetails;
import com.HelpForWarriors.util.DBconnection;

public class WarriorDetailsDao {
	public int save(WarriorDetails warriorDetails) {
		int result=0;
		try {
			Connection  connection=DBconnection.dbConnection();
			PreparedStatement pst=connection.prepareStatement("insert into warriordetails(name,rank,address,martyrDate) values (?,?,?,?)");
			pst.setString(1,warriorDetails.getName() );
			pst.setString(2,warriorDetails.getRank() );
			pst.setString(3, warriorDetails.getAddress());
			pst.setString(4, warriorDetails.getMartyrDate());
 result =pst.executeUpdate();
			

}
		catch(Exception e) {
			e.printStackTrace();
		}
		 return result;
	}
}
