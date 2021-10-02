package model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public abstract class BaseDAO {
	private Connection conn = null;
	private String url = "jdbc:mariadb://localhost:3306/super";
	private String user = "root";
	private String password = "lerm";

	public Connection getConnection() {
		if (conn == null) {
			try {
				conn = DriverManager.getConnection(url, user, password);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} else {
			return conn;
		}
		return conn;
	}
}