package com.cg.iter.jdbc;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.Scanner;

public class JdbcUpdate
{
	public static void main(String[] args)
	{
		String url="jdbc:oracle:thin:@localhost:1521:orcl";
		String user="iter";
		String password="iter123";
		Connection conn=null;
		String query="update emp set mobile =? where id=?";
		Scanner scan=new Scanner(System.in);
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, password);
			PreparedStatement stmt=conn.prepareStatement(query);
			System.out.println("Enter <id> <mobile> to update");
			stmt.setInt(2,scan.nextInt());
			stmt.setLong(1,scan.nextLong());
			int rows=stmt.executeUpdate();
			if(rows>0)System.out.println("Data Updated");
			else System.out.println("Failed to Update");
			ResultSet rs=stmt.executeQuery(query);
			//6. Iterate through the ResultSet
		}
		catch (ClassNotFoundException e)
		{
			System.out.println("Driver class not loaded");
		} catch (SQLException e)
		{
			e.printStackTrace();
		}
	}
}
