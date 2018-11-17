package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import anno.JDBCConfig;

@JDBCConfig(url="jdbc:mysql://localhost:3306/test",username="root",password="root")
public class DBUtil2 {
	static {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
	
	public static Connection getConnection() throws SQLException {
		JDBCConfig config=DBUtil2.class.getAnnotation(JDBCConfig.class);
		String url=config.url();
		String username=config.username();
		String password=config.password();
		
		return DriverManager.getConnection(url, username, password);
	}
	
	public static void main(String[] args) throws SQLException {
		System.out.println(getConnection());
	}

}
