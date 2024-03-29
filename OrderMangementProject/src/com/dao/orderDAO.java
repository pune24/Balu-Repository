package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.Utility.DBUtilityOrder;
import com.model.order;
//import com.utility.DBUtility;
import com.utility.DBUtility;

public class orderDAO {
	
	public int saveOrderdetails(order order) throws SQLException
	{
		Connection con=DBUtilityOrder.getConnection();
		PreparedStatement ps=null;
		int val=0;
		con=DBUtilityOrder.getConnection();
		String sql="insert into order1 values(?,?,?)";
		try
		{
			ps=con.prepareStatement(sql);
			ps.setInt(1,order.getOrderId());
			ps.setString(2,order.getItemName());
			ps.setDouble(3,order.getPrice());
			 val=ps.executeUpdate();
		}catch(Exception e)
		{
			System.out.println("Exception in save Student  " + e);
		}
	
		return val;
		
	}
	
	public int deleteOrder(order order) throws SQLException
	{
		PreparedStatement ps=null;
		 Connection con=DBUtilityOrder.getConnection();
		 int val=0;
		 String sql="delete from student where id=?";
		 try
			{
				 ps=con.prepareStatement(sql);
				 
				 ps.setInt(1,order.getOrderId());
				
				 val=ps.executeUpdate();
				 
			}
				catch(Exception e)
				{
					System.out.println("Exception occured in deleteStudent  student"+e);
				}
				return val;
	     
	}
	

}
