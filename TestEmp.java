package Employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TestEmp {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/javabatch";
		String username = "root";
		String password = "Nishant@3001";
	   
		Connection connection = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			connection =  DriverManager.getConnection(url, username, password);
			
			Statement statement = connection.createStatement();
			
			statement.execute("INSERT INTO employee VALUES(3,'Shubham','shubh@mail.com')");
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				connection.close();
				System.out.println("All Good");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
}
}


