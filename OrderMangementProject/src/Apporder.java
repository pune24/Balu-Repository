import java.sql.SQLException;
import java.util.Scanner;

import com.dao.orderDAO;
import com.model.order;



public class Apporder {
	
	public static void main(String[] args) throws SQLException {
		
		 Scanner ob1=new Scanner(System.in);
		System.out.println("1 Add");
		System.out.println("2.Delete");
		System.out.println("3.Update");
		System.out.println("Read All Data");
		
		System.out.println("Enter the choice");
		int choice=ob1.nextInt();
		orderDAO dao=new orderDAO();
		switch(choice)
		{
		       case 1:
		    	   System.out.println("Enter the orderId");
		    	   int orderId1=ob1.nextInt();
		    	   
		    	   System.out.println("Enter the Name");
		    	   String orderName1=ob1.nextLine();
		    	   ob1.nextLine();
		    	   
		    	   System.out.println("Enter the Price");
		    	    Double orderPrice1=ob1.nextDouble();
		    	    order s1=new order(orderId1,orderName1,orderPrice1);
		    	    
		    	    int i=dao.saveOrderdetails(s1);
		    		if(i>0)
		    			System.out.println("insert Record complted");
		    		else System.out.println("fail the insert Record");
		    			break;
		    	   
		       case 2:
		    	   System.out.println("enter the Id");
		    	   int DId=ob1.nextInt();
		    	   
		    	   order s3=new order();
		    	   s3.setOrderId(DId);
		    	   int i2=dao.deleteOrder(s3);
		    	   if(i2>0)
		    		   System.out.println("Delete complted");
		    	   else System.out.println("not delete");
		    	   break;
		    		   
		    	    
	
		    	   
		    	    
		    	    
		    	   
		    	 
		    	   
		    	   
		    	    
		    	 
		    	     
		    	   
		    	     
		    	   
		    	   
		    	   
			
			  
		}
		
		
	}

}
