package com.HelpForWarriors.util;
import java.sql.*;

public class DBconnection {
	public static Connection dbConnection(){
		Connection con= null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/helpforwarriors","root","root");
			
			
		}
		catch(Exception e){
			
			e.printStackTrace();
			}
		
	
	return con;
}
public static void main(String[]args) {
	System.out.println(dbConnection());

}
}