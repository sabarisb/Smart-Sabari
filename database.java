package brd;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class database {
	static
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
	}

	public static void insertEmployee(String CUSTOMER_ID, String CUSTOMER_CODE, String CUSTOMER_NAME,
			String CUSTOMER_PINCODE, String CUSTOMER_ADDRESS1, String CUSTOMER_ADDRESS2, String EMAIL_ADDRESS,
			String CONTACT_NUMBER, String RECORD_STATUS, String ACTIVE_INACTIVE_FLAG, String CREATE_DATE,
			String CREATE_BY, String MODIFIED_DATE, String MODIFIED_BY, String AUTHORIZED_DATE, String AUTHORIZED_BY) {

		try {
			// Load the driver
			
			// Create a statement
			Statement statement = connection.createStatement();
			PreparedStatement prepareStatement = connection
					.prepareStatement("Insert into SABARIS_CUSTOMER_TABLE values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
			PreparedStatement.setString(1, CUSTOMER_ID);
			PreparedStatement.setString(2, CUSTOMER_CODE);
			PreparedStatement.setString(3, CUSTOMER_NAME);
			PreparedStatement.setString(4, CUSTOMER_PINCODE);
			PreparedStatement.setString(5, CUSTOMER_ADDRESS1);
			PreparedStatement.setString(6, CUSTOMER_ADDRESS2);
			PreparedStatement.setString(7, EMAIL_ADDRESS);
			PreparedStatement.setString(8, CONTACT_NUMBER);
			PreparedStatement.setString(9, RECORD_STATUS);
			PreparedStatement.setString(10, ACTIVE_INACTIVE_FLAG);
			PreparedStatement.setString(11, CREATE_DATE);
			PreparedStatement.setString(12, CREATE_BY);
			PreparedStatement.setString(13, MODIFIED_DATE);
			PreparedStatement.setString(14, MODIFIED_BY);
			PreparedStatement.setString(15, AUTHORIZED_DATE);
			PreparedStatement.setString(16, AUTHORIZED_BY);

			prepareStatement.executeUpdate();

		} catch (ClassNotFoundException exception) {
			System.out.println(exception);
		} catch (SQLException exception) {
			System.out.println(exception);
		}
	}
}

// Execute a Query
//			ResultSet employeeResultSet = statement.executeQuery("SELECT customer_ID,CUSTOMER_CODE,CUSTOMER_NAME,CUSTOMER_PINCODE,CUSTOMER_ADDRESS1,CUSTOMER_ADDRESS2,EMAIL_ADDRESS,CONTACT_NUMBER,PRIMARY_CONTACT_PERSON,RECORD_STATUS,ACTIVE_INACTIVE_FLAG,CREATE_DATE,CREATED_BY,MODIFIED_DATE,MODIFIED_BY,AUTHORIZED_DATE,AUTHORIZED_BY FROM emp");
//			//Iterate through the result set and display the records.
//			System.out.println("SABARIS_CUSTOMER_NAME!");
//			while(employeeResultSet.next()) {
//				System.out.println(employeeResultSet.getInt(1) + "\t" +employeeResultSet.getString("first_name") );
//				String Query = "Insert into SABARIS_CUSTOMER_NAME values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
//	            Connection con = null;
//				PreparedStatement ps = con.prepareStatement(Query);
//
////            String CUSTOMER_ID = null;
//				ps.setString(1, CUSTOMER_ID);
//	            String CUSTOMER_CODE;
//				ps.setString(2, CUSTOMER_CODE );
//	            String CUSTOMER_NAME;
//				ps.setString(3, CUSTOMER_NAME);
//	            Date CUSTOMER_ADDRESS1;
//			 	ps.setDate(4, CUSTOMER_ADDRESS1);
//	            String CUSTOMER_ADDRESS2;
//				ps.setString(5, CUSTOMER_ADDRESS2);
//	            String EMAIL_ADDRESS;
//	            String CUSTOMER_PINCODE;
//				ps.setString(6, CUSTOMER_PINCODE);
//				ps.setString(7, EMAIL_ADDRESS);
//	            String CONTACT_NUMBER;
//				ps.setString(8, CONTACT_NUMBER);
//	            String RECORD_STATUS;
//	            String PRIMARY_CONTACT_PERSON;
//				ps.setString(9, PRIMARY_CONTACT_PERSON);
//				ps.setString(10, RECORD_STATUS);
//	            String CREATE_DATE;
//	            String ACTIVE_INACTIVE_FLAG;
//				ps.setString(11, ACTIVE_INACTIVE_FLAG);
//				ps.setString(12, CREATE_DATE);
//	            String CREATE_BY;
//				ps.setString(13, CREATE_BY);
//	            String MODIFIED_DATE;
//				ps.setString(14, MODIFIED_DATE );
//	            String MODIFIED_BY;
//				ps.setString(15, MODIFIED_BY);
//	            String AUTHORIZED_DATE;
//				ps.setString(16, AUTHORIZED_DATE);
//	            String AUTHORIZED_BY;
//				ps.setString(17, AUTHORIZED_BY);
//	          
//			}
//			
//		} catch (ClassNotFoundException exception) {
//			System.out.println(exception);
//		} catch (SQLException exception) {
//			System.out.println(exception);
//		}
//	}
