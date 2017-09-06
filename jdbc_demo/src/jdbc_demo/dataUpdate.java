package jdbc_demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class dataUpdate {

	public static void main(String[] args) {
		try {
			// 1. Get a connection to database
			Connection myConn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/demo", "root", "root");
			// 2. Create a statement
			Statement myStmt = myConn.createStatement();
			// 3. Execute SQL query
			String sql 	= " update employees" //muista väli!
						+ " set email='demo@gmail.net'"
						+ " where id=13";
			
			myStmt.executeUpdate(sql);
			
			System.out.println("Update Complete");
			
		}
		catch (Exception exc) {
			exc.printStackTrace();
		}

	}

}
