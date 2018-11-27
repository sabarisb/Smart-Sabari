package com.brd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Database {
	static Connection connection = null;
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			 connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
		} 
		catch (ClassNotFoundException e) 
		{
			System.out.println(e);
		}
		catch(SQLException e)
		{
			System.out.println(e);
		}
	}

	static PreparedStatement prepareStatement = null;
	public static void insertEmployee(String CUSTOMER_ID, String CUSTOMER_CODE, String CUSTOMER_NAME,
			String CUSTOMER_PINCODE, String CUSTOMER_ADDRESS1, String CUSTOMER_ADDRESS2, String EMAIL_ADDRESS,
			String CONTACT_NUMBER,String PRIMARY_CONTACT_PERSON, String RECORD_STATUS, String ACTIVE_INACTIVE_FLAG, String CREATE_DATE,
			String CREATE_BY, String MODIFIED_DATE, String MODIFIED_BY, String AUTHORIZED_DATE, String AUTHORIZED_BY) {

		try {
		
		
			prepareStatement = connection.prepareStatement("INSERT INTO SABARIS_CUSTOMER_TABLE values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
			prepareStatement.setString(1, CUSTOMER_ID);
			prepareStatement.setString(2, CUSTOMER_CODE);
			prepareStatement.setString(3, CUSTOMER_NAME);
			prepareStatement.setString(4, CUSTOMER_PINCODE);
			prepareStatement.setString(5, CUSTOMER_ADDRESS1);
			prepareStatement.setString(6, CUSTOMER_ADDRESS2);
			prepareStatement.setString(7, EMAIL_ADDRESS);
			prepareStatement.setString(8, CONTACT_NUMBER);
			prepareStatement.setString(9, PRIMARY_CONTACT_PERSON);
			prepareStatement.setString(10, RECORD_STATUS);
			prepareStatement.setString(11, ACTIVE_INACTIVE_FLAG);
			prepareStatement.setString(12, CREATE_DATE);
			prepareStatement.setString(13, CREATE_BY);
			prepareStatement.setString(14, MODIFIED_DATE);
			prepareStatement.setString(15, MODIFIED_BY);
			prepareStatement.setString(16, AUTHORIZED_DATE);
			prepareStatement.setString(17, AUTHORIZED_BY);

			prepareStatement.executeUpdate();

		} catch (SQLException exception) {
			System.out.println(exception);
		}
	}
}
