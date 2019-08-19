package dev.endcraft.storage.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseFactory {
	
	private Connection conn;
	
	public DatabaseFactory(String url, String username, String password) {
		try {
			conn = DriverManager.getConnection(url, username, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	
	public Connection getConnection() {
		return this.conn;
	}

}
