package jdbc_demo;

import java.sql.*;

public class Driver {

	public static void main(String[] args) {
		try {
			// 1. Get a connection to database
			Connection myConn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/demo", "root", "root");
			// 2. Create a statement
			Statement myStmt = myConn.createStatement();
			// 3. Execute SQL query
			ResultSet myRs = myStmt.executeQuery("select * from employees");
			// 4. Get the result set
			while (myRs.next()) {
				System.out.println(myRs.getString("last_name") + ", " + myRs.getString("first_name"));
			}
		}
		catch (Exception exc) {
			exc.printStackTrace();
		}

	}

}
