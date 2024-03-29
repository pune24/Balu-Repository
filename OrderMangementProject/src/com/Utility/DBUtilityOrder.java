package com.Utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DBUtilityOrder {
	public static Connection getConnection()
	{
		 Connection con=null;
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
     con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","Pass@123");
       
	}catch(Exception e)
		{
		    System.out.println("Exception prsent in the DBUtilityOrder"+e);
		}
		 return con;

}
}
