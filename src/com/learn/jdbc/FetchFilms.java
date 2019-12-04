package com.learn.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import com.mysql.cj.jdbc.Driver;

public class FetchFilms {
	private static String url = "jdbc:mysql://localhost:3306/sakila";
	private static String userName = "root";
	private static String password = "shreya@123";
	private static String selectAllFilm = "select film_id,title,description,release_year,language_id,original_language_id from film";
			

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Driver mysqlDriver = new Driver();
			DriverManager.registerDriver(mysqlDriver);
			Properties props = new Properties();
			props.setProperty("user",userName);
			props.setProperty("password",password);
			Connection conn = DriverManager.getConnection(url,props);
			Statement stat = conn.createStatement();
			ResultSet rs = stat.executeQuery(selectAllFilm);
			if (rs!=null) {
				int film_id = 0;
				String title = null;
				String description = null;
				String release_year = null;
				int language_id = 0;
				int original_language_id = 0;
				
				
				while (rs.next()) {
					film_id = rs.getInt("film_id");
					title = rs.getString("title");
					description = rs.getString("description");
					release_year = rs.getString("release_year");
					language_id = rs.getInt("language_id");
					original_language_id = rs.getInt("original_language_id");
					System.out.println(film_id + " " +title + " "+description+" "+release_year +" "+language_id +" "+original_language_id);
				}
			}
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
