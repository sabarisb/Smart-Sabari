package brd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Makercheckerbrd {
	static Connection connection = null;
	{
		try {

			Class.forName("oracle.jdbc.driver.OracleDriver");

			Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");

			Statement statement = connection.createStatement();

			ResultSet employeeResultSet = statement.executeQuery("SELECT user_id,password FROM sabaris_database");

		} catch (ClassNotFoundException exception) {
			System.out.println(exception);
		} catch (SQLException exception1) {
			char[] exception = null;
			System.out.println(exception);
		}
	}

	private static void users(String user_id, String password) {
		try {

			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
			Statement statement = connection.createStatement();

			String insertQuery = "insert into sabaris_database values('" + user_id + "','" + password + "')";

			int noOfRowsAffected = statement.executeUpdate(insertQuery);

			System.out.println(noOfRowsAffected + " row(s) inserted!");
		} catch (Exception e) {

		}
	}

}
