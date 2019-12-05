package com.learn.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

public class DeleteDynamicPass {
	private static String url = "jdbc:mysql://localhost:3306/sakila";
	private static String userName = "root";
	private static String password = "shreya@123";
	private static String deleteQuery = "Delete from actor where actor_id = ?";
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
					
			try {
				//Driver mysqlDriver = new Driver();
				//DriverManager.registerDriver(mysqlDriver);
				Class.forName("com.mysql.cj.jdbc.Driver");
				Properties props = new Properties();
				props.setProperty("user", userName);
				props.setProperty("password", password);	
				Connection conn = DriverManager.getConnection(url,props);
				PreparedStatement pStat = conn.prepareStatement(deleteQuery);
				pStat.setInt(1, 201);
				int rowsAffected = pStat.executeUpdate();
				System.out.println("Rows Affected :" +rowsAffected);
						
								
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block				
				e.printStackTrace();
			} catch (ClassNotFoundException ex) {
				// TODO Auto-generated catch block
				ex.printStackTrace();
			}


	}

}
