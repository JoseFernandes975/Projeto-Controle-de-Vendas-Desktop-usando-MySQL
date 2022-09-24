package br.com.project.JDBC;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class ConnectionFactory {
    private static Connection conn;
    
    public Connection getConnection(){
   if(conn == null) {
			try {
			Properties props = loadProperties();
			String url = props.getProperty("dburl");
			conn = DriverManager.getConnection(url, props);
		}
		catch (Exception e) {
			throw new RuntimeException(e.getMessage());
		}
	}
		return conn;
	}

	private static Properties loadProperties() {
		try(FileInputStream fs = new FileInputStream("db.properties")){
			Properties prop = new Properties();
			prop.load(fs);
			return prop;
		}
		catch(IOException e) {
			throw new RuntimeException(e.getMessage());
		}
	}
	
	public static void closeConnection() {
		if(conn != null) {
			try {
				conn.close();
			} catch (Exception e) {
			throw new RuntimeException(e.getMessage());
			}
		}
		
	}
	
}



