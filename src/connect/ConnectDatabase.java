package connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDatabase {
	public static Connection getConnection() {
		try {
<<<<<<< HEAD
			String url = "jdbc:mysql://localhost:3306/QuanLyHieuSach";
=======
			String url = "jdbc:mysql://localhost:3306/quanlyhieusach";
>>>>>>> 04b84764fb2ec9a010ab47671c74e1591b50cae6
			String username="root";
			String password = "020501";
			Class.forName("com.mysql.cj.jdbc.Driver");
			return DriverManager.getConnection(url, username, password);
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
	public static void main(String[] args) {
		Connection con = getConnection();
		if( con != null) {
			System.out.println("Connect Success");
		}else
			System.out.println("Connect Error");
	}
}
