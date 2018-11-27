package brd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Makercheckerbrd  
	
	try {
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
		
		Statement statement = connection.createStatement();
	
		ResultSet employeeResultSet = statement.executeQuery("SELECT user_id,password,user_type FROM users");
		
		
		
	} catch (ClassNotFoundException exception1) {
		System.out.println(exception1);
	} catch (SQLException exception) {
		System.out.println(exception1);
	}
	private static void users(String user_id,String password ) {
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
			Statement statement = connection.createStatement();
			
			String insertQuery = "insert into emp values('" + user_id + "','" + password + "')";
			
			int noOfRowsAffected = statement.executeUpdate(insertQuery);
			
			System.out.println(noOfRowsAffected + " row(s) inserted!");
		}                                                                                

	
}
}
}
