package com.mindgate.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmployeeCRUDMain {

	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "system";
		String password = "mindgate123";
		String driver = "oracle.jdbc.driver.OracleDriver";
		
		int resultCount = 0;
		String sqlQuery = "";
		
		
		Connection connection;
		Statement statement;
		ResultSet resulset;
		PreparedStatement preparedStatement;
		
//		try {
//			Class.forName(driver);
//			connection = DriverManager.getConnection(url, user, password);
//			statement = connection.createStatement();
//			sqlQuery = "select * From Employe_details";
//			resulset = statement.executeQuery(sqlQuery);
//			
//			while(resulset.next()) {
//				System.out.println(resulset.getInt("employee_id"));
//				System.out.println(resulset.getString("name"));
//				System.out.println(resulset.getDouble("salary"));
//				System.out.println("-".repeat(50));
//			}
//			connection.close();
//			System.out.println("you got the details!!!");	
//		} catch (ClassNotFoundException | SQLException e) {
//			System.out.println("exception");
//			e.printStackTrace();
//		}
//	
//		
//		
		
//		try {
//			Class.forName(driver);
//			connection = DriverManager.getConnection(url, user, password);
//			sqlQuery = "delete employe_details where employee_id = ?";
////			statement = connection.createStatement();
//			preparedStatement = connection.prepareStatement(sqlQuery);
//			preparedStatement.setInt(1, 4);
//			resultCount = preparedStatement.executeUpdate();
//			connection.close();
////			sqlQuery = "delete employe_details where employee_id = 5";
////			resultCount = statement.executeUpdate(sqlQuery);
//			if(resultCount > 0)
//				System.out.println("deleted successfully");
//			else
//				System.out.println("you are loser!!");
//		} catch (ClassNotFoundException | SQLException e) {
//			System.out.println("Exception");
//			e.printStackTrace();
//		}
//		
//		
		
//		try {
//			Class.forName(driver);
//			connection = DriverManager.getConnection(url,user,password);
//			sqlQuery = "UPDATE employe_details set name = ?,salary = ? WHERE employee_id = 3";
//			preparedStatement= connection.prepareStatement(sqlQuery);
//			preparedStatement.setString(1, "Sachin");
//			preparedStatement.setDouble(2, 12321);
//			resultCount=preparedStatement.executeUpdate();
//			connection.close();
//			if(resultCount > 0)
//				System.out.println("updated!!");
//			else
//				System.out.println("kuch toh gadbadb hai");
//		} catch (ClassNotFoundException | SQLException e) {
//			System.out.println("exception");
//			e.printStackTrace();
//		}
		
		System.out.println("Insert Examle");
		try {
			Class.forName(driver);
			connection = DriverManager.getConnection(url, user, password);
			sqlQuery = "INSERT INTO employe_details(name,salary)VALUES(?,?)";
			preparedStatement = connection.prepareStatement(sqlQuery);
			preparedStatement.setString(1, "Shyam");
			preparedStatement.setDouble(2, 123343);
			resultCount = preparedStatement.executeUpdate();
//			System.out.println(resultCount);
			connection.close();
			if(resultCount > 0)
				System.out.println("recorded !!!");
			else
				System.out.println("Failed!!");
		}
		catch (ClassNotFoundException | SQLException e) {
			System.out.println("Exception handled!!");
			System.out.println(e.getMessage());
		}
	}

}
