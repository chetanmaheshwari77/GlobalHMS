package com.cts.mfrp.connection;

import java.sql.DriverManager;
import java.sql.SQLException;



public class databaseconnection
{

	public java.sql.Connection database() throws SQLException, ClassNotFoundException
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
			java.sql.Connection con = DriverManager.getConnection(
	//			"jdbc:oracle:thin:@PC199061:1521:XE", "mrch", "mrch");
		"jdbc:oracle:thin:@PC199062:1521:XE", "orcl", "password-1");
		return con;
	}
public static void main(String a[]){
	databaseconnection databaseconnection = new databaseconnection();
	try {
		System.out.println(databaseconnection.database());
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
	
}
