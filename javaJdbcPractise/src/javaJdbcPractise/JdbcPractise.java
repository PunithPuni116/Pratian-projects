package javaJdbcPractise;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcPractise {
	public static void main(String[] args) {
		
			//Class.forName("com.mysql.jdbc.Driver");
			Connection con;
			try {
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/salesorder","root","Voldemort@2798");
			
			java.sql.Statement stm=con.createStatement();
			ResultSet rs=stm.executeQuery("Select * from customaster");
			
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2));
			}
	}
	catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
	}
}
