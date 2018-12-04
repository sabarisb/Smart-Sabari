package servlet;

import java.io.IOException;
import java.net.PasswordAuthentication;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("")
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String username = request.getParameter("user_id");
	String password = request.getParameter("pwd");
	System.out.println(username +":"+ password);
	}
	public static void main(String[] args) //main method
    {
     Connection conn = null;
     try
     {
    
     Class.forName("com.oraclesql.jdbc.Driver");
  
     System.out.println("Connecting to a selected database...");
   //  conn = DriverManager.getConnection(User_id, Password);
              
     System.out.println("Connected database successfully...");      
               }
     catch(SQLException se) 
     {
   
     se.printStackTrace();
     }
     catch(Exception e) 
   
     e.printStackTrace();
     }
     finally  
     {
     
     try  
     {
     if( )
     conn.close(); 
     }
     catch(SQLException se)
     
     se.printStackTrace();
     }
     }
     System.out.println("Goodbye!");  
     }
}
}
